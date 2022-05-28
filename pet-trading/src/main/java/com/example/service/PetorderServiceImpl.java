package com.example.service;

import com.example.dao.PetorderMapper;
import com.example.domain.Petorder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PetorderServiceImpl implements PetorderService {

    @Autowired
    private PetorderMapper petorderMapper;

    @Override
    public int addpetorder(Petorder petorder) {
        return petorderMapper.addpetorder(petorder);
    }

    @Override
    public int deletepetorder(Map map) {
        return petorderMapper.deletepetorder(map);
    }

    @Override
    public int updatepetorder(Petorder petorder) {
        return petorderMapper.updatepetorder(petorder);
    }

    @Override
    public List<Petorder> querypetorder(Map map) {
        return petorderMapper.querypetorder(map);
    }

    @Override
    public List<Petorder> querypetorderpage(Map map) {
        return petorderMapper.querypetorderpage(map);
    }

    @Override
    public int countpetorder(Map map) {
        return petorderMapper.countpetorder(map);
    }
}
