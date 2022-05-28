package com.example.service;

import com.example.dao.PetMapper;
import com.example.domain.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetMapper petMapper;

    @Override
    public int addPet(Pet pet) {
        return petMapper.addPet(pet);
    }

    @Override
    public int deletePet(Map map) {
        return petMapper.deletePet(map);
    }

    @Override
    public int updatePet(Pet pet) {
        return petMapper.updatePet(pet);
    }

    @Override
    public Pet queryPetById(Long pid) {
        return petMapper.queryPetById(pid);
    }

    @Override
    public List<Pet> queryPetByName(String petname) {
        return petMapper.queryPetByName(petname);
    }

    @Override
    public List<Pet> queryAllPet(Map map) {
        return petMapper.queryAllPet(map);
    }

    @Override
    public int setPetbkidNULL(Long bkid) {
        return petMapper.setPetbkidNULL(bkid);
    }

    @Override
    public List<Pet> queryPetpage(Map map) {
        return petMapper.queryPetpage(map);
    }

    @Override
    public Integer querypetcount(Map map) {
        return petMapper.querypetcount(map);
    }

    @Override
    public String queryMaxPrice() {
        return petMapper.queryMaxPrice();
    }

    @Override
    public List<Map> queryage() {
        return petMapper.queryage();
    }
}
