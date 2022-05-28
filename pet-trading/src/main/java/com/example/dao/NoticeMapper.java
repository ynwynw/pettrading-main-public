package com.example.dao;

import com.example.domain.Notice;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface NoticeMapper {

    @Insert("insert into notice (date,fromavatar,fromuid,fromusername,isread,msg,pid,touid,tousername,type)" +
            "value (#{date},#{fromavatar},#{fromuid},#{fromusername},#{isread},#{msg},#{pid},#{touid},#{tousername},#{type})")
    int addNotice(Notice notice);

    int deleteNotice(Map map);

    List<Notice> querynotice(Map map);

    int queryisread(Map map);


    List<Notice> queryusernotice(Map map);
}
