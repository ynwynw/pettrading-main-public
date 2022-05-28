package com.example.service;

import com.example.domain.Notice;

import java.util.List;
import java.util.Map;

public interface NoticeService {
    int addNotice(Notice notice);

    int deleteNotice(Map map);

    List<Notice> querynotice(Map map);

    int queryisread(Map map);

    List<Notice> queryusernotice(Map map);
}
