package com.example.service;

import com.example.domain.Petorder;

import java.util.List;
import java.util.Map;

public interface PetorderService {
    int addpetorder(Petorder petorder);
    int deletepetorder(Map map);
    int updatepetorder(Petorder petorder);
    List<Petorder> querypetorder(Map map);
    List<Petorder> querypetorderpage(Map map);
    int countpetorder(Map map);
}
