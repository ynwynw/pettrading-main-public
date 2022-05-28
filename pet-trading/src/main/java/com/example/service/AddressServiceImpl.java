package com.example.service;

import com.example.dao.AddressMapper;
import com.example.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public int addAddress(Address address) {
        return addressMapper.addAddress(address);
    }

    @Override
    public int deleteAddress(Map map) {
        return addressMapper.deleteAddress(map);
    }

    @Override
    public int updateAddress(Address address) {
        return addressMapper.updateAddress(address);
    }

    @Override
    public List<Address> queryAddressbyuid(Map map) {
        return addressMapper.queryAddressbyuid(map);
    }

    @Override
    public List<Address> queryAddress(Map map) {
        return addressMapper.queryAddress(map);
    }

    @Override
    public int countaddress(Map map) {
        return addressMapper.countaddress(map);
    }
}
