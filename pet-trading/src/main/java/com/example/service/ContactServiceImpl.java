package com.example.service;

import com.example.dao.ContactMapper;
import com.example.domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactMapper contactMapper;

    @Override
    public int addContact(Contact contact) {
        return contactMapper.addContact(contact);
    }

    @Override
    public int deleteContact(Map map) {
        return contactMapper.deleteContact(map);
    }

    @Override
    public int updateContact(Contact contact) {
        return contactMapper.updateContact(contact);
    }

    @Override
    public List<Contact> queryContact(Map map) {
        return contactMapper.queryContact(map);
    }

    @Override
    public int querynoread(Map map) {
        return contactMapper.querynoread(map);
    }
}
