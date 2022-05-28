package com.example.dao;

import com.example.domain.Pet;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PetMapper {

    @Insert("insert into pet (petname,sex,bkid,skid,uid,age,price,pk,description,date) " +
            "value (#{petname},#{sex},#{bkid},#{skid},#{uid},#{age},#{price},#{pk},#{description},#{date})")
    @Options(useGeneratedKeys = true,keyProperty = "pid")
    int addPet(Pet pet);

    int deletePet(Map map);

    int updatePet(Pet pet);

    Pet queryPetById(Long pid);

    //根据名字模糊查询
    List<Pet> queryPetByName(String petname);

    List<Pet> queryAllPet(Map map);

    @Update("update pet set bkid=1 where bkid=#{bkid}")
    int setPetbkidNULL(Long bkid);

    //分页查询
    List<Pet> queryPetpage(Map map);

    //查询宠物总数
    Integer querypetcount(Map map);

    //查询宠物最高价格
    @Select("select max(price) from pet")
    String queryMaxPrice();

    //查询宠物所有年龄
    @Select("select distinct age from pet order by age")
    List<Map> queryage();
}
