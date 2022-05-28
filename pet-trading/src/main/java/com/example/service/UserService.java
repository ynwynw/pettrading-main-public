package com.example.service;

import com.example.domain.ContactUser;
import com.example.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface UserService {

    int addUser(User user);

    User queryUser(Map map);

    int updateUser(User user);

    int deleteUser(Map map);

    List<User> queryAllUser(Map map);

    int countuser(Map map);

    List<ContactUser> querycontactuser(Long uid);

    List<User> queryuserby(Map map);
}
