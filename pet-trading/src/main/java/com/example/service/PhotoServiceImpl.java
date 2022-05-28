package com.example.service;

import com.example.dao.PhotoMapper;
import com.example.domain.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PhotoServiceImpl implements PhotoService{

    @Autowired
    private PhotoMapper photoMapper;

    @Override
    public int addPhoto(Photo photo) {
        return photoMapper.addPhoto(photo);
    }

    @Override
    public int deletePhoto(Map map) {
        return photoMapper.deletePhoto(map);
    }

    @Override
    public int updatePhoto(Photo photo) {
        return photoMapper.updatePhoto(photo);
    }

    @Override
    public List<Photo> queryAllPhoto() {
        return photoMapper.queryAllPhoto();
    }

    @Override
    public List<Photo> queryPhotobypid(Long pid) {
        return photoMapper.queryPhotobypid(pid);
    }
}
