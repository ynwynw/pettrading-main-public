package com.example.controller;

import com.example.domain.Contact;
import com.example.domain.Notice;
import com.example.service.ContactService;
import com.example.service.NoticeService;
import com.example.service.PetService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

@Component
@ServerEndpoint("/message/{fromuid}")
public class NoticeWebsocket {
    private Long fromuid;
    private Session session;
    private Contact contact;

    private static PetService petService;
    private static NoticeService noticeService;
    private static ContactService contactService;
    @Autowired
    public void setPetService(PetService petService){
        NoticeWebsocket.petService = petService;
    }

    @Autowired
    public void setNoticeService(NoticeService noticeService) {
        NoticeWebsocket.noticeService = noticeService;
    }

    @Autowired
    public void setContactService(ContactService contactService) {
        NoticeWebsocket.contactService = contactService;
    }

    //用来存放每个客户端对应的MyWebSocket对象。
    private static CopyOnWriteArraySet<NoticeWebsocket> noticeSet = new CopyOnWriteArraySet<>();

    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    //用来记录sessionId和该session进行绑定
    private static Map<Long, Session> map = new HashMap<Long, Session>();

    /**
     * 连接建立成功调用的方法
     */
    @OnOpen
    public void onOpen(Session session, @PathParam("fromuid") Long fromuid) {
        Map<String,Object> message=new HashMap<String, Object>();
        this.session = session;
        this.fromuid = fromuid;
        map.put(fromuid, session);
        noticeSet.add(this);//加入set中
        System.out.println("用户（"+ fromuid + ")" + "加入,当前在线人数为" + noticeSet.size());
        Map qumap = new HashMap();
        qumap.put("fromuid",fromuid);
        int noread = contactService.querynoread(qumap);
        qumap.remove("fromuid");
        qumap.put("type",-1);
        qumap.put("noread",noread);
        this.session.getAsyncRemote().sendText(new Gson().toJson(qumap));
    }

    /**
     * 连接关闭调用的方法    
     */
    @OnClose
    public void onClose() {
        noticeSet.remove(this); //从set中删除
        System.out.println("有一连接关闭！当前在线人数为" + noticeSet.size());
    }

    /**
     * 收到客户端消息后调用的方法
     * @param message 客户端发送过来的消息
     */
    @OnMessage
    public void onMessage(String message, Session session, @PathParam("fromuid") Long fromuid) {
        //从客户端传过来的数据是json数据，所以这里使用jackson进行转换为SocketMsg对象，
        // 然后通过socketMsg的type进行判断信息类型:
        if(message.equals("heartCheck")){
            Session fromSession = map.get(fromuid);
            fromSession.getAsyncRemote().sendText("heartCheck");
        }else {
            Notice notice = new Gson().fromJson(message, Notice.class);
            notice.setFromuid(fromuid);
            Date date = new Date();
            notice.setDate(date);
            notice.setIsread(0);
//        System.out.println(notice);
            noticeService.addNotice(notice);
            contact = new Contact();
            contact.setFromuid(notice.getTouid());
            contact.setTouid(notice.getFromuid());
            Map contactmap = new HashMap();
            contactmap.put("fromuid", notice.getTouid());
            contactmap.put("touid", notice.getFromuid());
            List<Contact> contacts = contactService.queryContact(contactmap);
            if (contacts.size() == 0) {
                contact.setNoread(0);
                contactService.addContact(contact);
                contact.setNoread(null);
            }
            contactService.updateContact(contact);
            Session fromSession = map.get(notice.getFromuid());
            Session toSession = map.get(notice.getTouid());
            fromSession.getAsyncRemote().sendText(new Gson().toJson(notice));
            if (toSession != null) {
                toSession.getAsyncRemote().sendText(new Gson().toJson(notice));
            }
        }
    }

    /**
     * 发生错误时调用   
     */
    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("发生错误");
        error.printStackTrace();
    }
}
