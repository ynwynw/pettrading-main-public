package com.example.service;

import com.example.dao.NoticeMapper;
import com.example.domain.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NoticeServiceImpl implements NoticeService{

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public int addNotice(Notice notice) {
        return noticeMapper.addNotice(notice);
    }

    @Override
    public int deleteNotice(Map map) {
        return noticeMapper.deleteNotice(map);
    }

    @Override
    public List<Notice> querynotice(Map map) {
        return noticeMapper.querynotice(map);
    }

    @Override
    public int queryisread(Map map) {
        return noticeMapper.queryisread(map);
    }

    @Override
    public List<Notice> queryusernotice(Map map) {
        return noticeMapper.queryusernotice(map);
    }
}
