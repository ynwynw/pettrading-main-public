package com.example.controller;

import com.example.domain.Notice;
import com.example.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/notice")
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @GetMapping("/querynotice")
    public List<Notice> querynotice(Long fromuid,Long touid) {
        Map map = new HashMap();
        map.put("fromuid",fromuid);
        map.put("touid",touid);
        return noticeService.querynotice(map);
    }

    @GetMapping("/queryusernotice")
    public List<Notice> queryusernotice(Long uid) {
        Map map = new HashMap();
        map.put("uid",uid);
        return noticeService.queryusernotice(map);
    }
}
