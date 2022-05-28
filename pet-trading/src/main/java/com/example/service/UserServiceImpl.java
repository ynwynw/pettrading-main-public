package com.example.service;

import com.example.dao.UserMapper;
import com.example.domain.ContactUser;
import com.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public User queryUser(Map map) {
        return userMapper.queryUser(map);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int deleteUser(Map map) {
        return userMapper.deleteUser(map);
    }

    @Override
    public List<User> queryAllUser(Map map) {
        return userMapper.queryAllUser(map);
    }

    @Override
    public int countuser(Map map) {
        return userMapper.countuser(map);
    }

    @Override
    public List<ContactUser> querycontactuser(Long uid) {
        return userMapper.querycontactuser(uid);
    }

    @Override
    public List<User> queryuserby(Map map) {
        return userMapper.queryuserby(map);
    }
}
