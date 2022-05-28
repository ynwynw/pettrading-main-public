package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;
import java.util.Date;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notice {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long nid;
    private Integer type;//类型  0-普通消息，1-提交订单，2-修改订单，3-取消订单，4-完成订单，5-确认修改订单，6-确认删除订单,7-帮助求购
    private Long fromuid;//发送者
    private String fromusername;//发送者名字
    private String fromavatar;//发送者头像
    private Long touid;//接收者
    private String tousername;//发送者名字
    private String msg;//消息
    private Long pid;//订单的宠物id
    private Date date;//发送时间
    private Integer isread;//是否已读 0-未读，1-已读
}
