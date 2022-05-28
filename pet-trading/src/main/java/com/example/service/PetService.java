package com.example.service;

import com.example.domain.Pet;

import java.util.List;
import java.util.Map;

public interface PetService {
    int addPet(Pet pet);
    int deletePet(Map map);
    int updatePet(Pet pet);
    Pet queryPetById(Long pid);
    List<Pet> queryPetByName(String petname);
    List<Pet> queryAllPet(Map map);
    int setPetbkidNULL(Long bkid);
    List<Pet> queryPetpage(Map map);
    Integer querypetcount(Map map);
    String queryMaxPrice();
    List<Map> queryage();
}
