package com.example.service;

import com.example.domain.Address;

import java.util.List;
import java.util.Map;

public interface AddressService {
    int addAddress(Address address);

    int deleteAddress(Map map);

    int updateAddress(Address address);

    List<Address> queryAddressbyuid(Map map);

    List<Address> queryAddress(Map map);

    int countaddress(Map map);
}
