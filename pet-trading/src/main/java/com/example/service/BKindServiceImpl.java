package com.example.service;

import com.example.dao.BKindMapper;
import com.example.domain.BKind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class BKindServiceImpl implements BKindService {

    @Autowired
    private BKindMapper BKindMapper;

    @Override
    public int addBKind(BKind bkind) {
        return BKindMapper.addBKind(bkind);
    }

    @Override
    public int deleteBKind(Long bkid) {
        return BKindMapper.deleteBKind(bkid);
    }

    @Override
    public int updateBKind(BKind bkind) {
        return BKindMapper.updateBKind(bkind);
    }

    @Override
    public List<BKind> queryBKind() {
        return BKindMapper.queryBKind();
    }

    @Override
    public List<Map> queryBKindname() {
        return BKindMapper.queryBKindname();
    }

    @Override
    public List<BKind> queryBKindandSKind(Map map) {
        return BKindMapper.queryBKindandSKind(map);
    }
}
