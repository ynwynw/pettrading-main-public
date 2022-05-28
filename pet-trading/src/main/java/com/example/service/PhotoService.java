package com.example.service;

import com.example.domain.Photo;

import java.util.List;
import java.util.Map;

public interface PhotoService {
    int addPhoto(Photo photo);

    int deletePhoto(Map map);

    int updatePhoto(Photo photo);

    List<Photo> queryAllPhoto();

    List<Photo> queryPhotobypid(Long pid);
}
