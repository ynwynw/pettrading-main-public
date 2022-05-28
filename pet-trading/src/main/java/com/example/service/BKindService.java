package com.example.service;

import com.example.domain.BKind;

import java.util.List;
import java.util.Map;

public interface BKindService {

    int addBKind(BKind bkind);

    int deleteBKind(Long bkid);

    int updateBKind(BKind bkind);

    List<BKind> queryBKind();

    List<Map> queryBKindname();

    List<BKind> queryBKindandSKind(Map map);
}
