package com.example.dao;

import com.example.domain.Address;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AddressMapper {

    @Insert("insert into address (phone,address,uid,username) value (#{phone},#{address},#{uid},#{username})")
    @Options(useGeneratedKeys = true,keyProperty = "aid")
    int addAddress(Address address);

    int deleteAddress(Map map);

    int updateAddress(Address address);

    @Select("select * from address where uid=#{uid}")
    List<Address> queryAddressbyuid(Map map);

    List<Address> queryAddress(Map map);

    int countaddress(Map map);
}
