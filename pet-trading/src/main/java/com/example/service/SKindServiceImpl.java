package com.example.service;

import com.example.dao.SKindMapper;
import com.example.domain.SKind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SKindServiceImpl implements SKindService {

    @Autowired
    private SKindMapper sKindMapper;

    @Override
    public int addSKind(SKind skind) {
        return sKindMapper.addSKind(skind);
    }

    @Override
    public int deleteSKind(Map map) {
        return sKindMapper.deleteSKind(map);
    }

    @Override
    public int updateSKind(SKind skind) {
        return sKindMapper.updateSKind(skind);
    }

    @Override
    public List<SKind> queryAllSKind(Map map) {
        return sKindMapper.queryAllSKind(map);
    }
}
