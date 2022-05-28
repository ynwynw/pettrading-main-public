package com.example.dao;

import com.example.domain.Photo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Repository
public interface PhotoMapper {

    @Insert("insert into photo (url,pid) values (#{url},#{pid})")
    int addPhoto(Photo photo);

    int deletePhoto(Map map);

    int updatePhoto(Photo photo);

    @Select("select * from photo")
    List<Photo> queryAllPhoto();

    @Select("select * from photo where pid=#{pid}")
    List<Photo> queryPhotobypid(Long pid);
}
