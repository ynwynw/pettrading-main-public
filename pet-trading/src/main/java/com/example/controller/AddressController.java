package com.example.controller;

import com.example.domain.Address;
import com.example.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping("/addAddress")
    public Map addAddress(Address address){
        addressService.addAddress(address);
        Map map = new HashMap();
        map.put("aid",address.getAid());
        map.put("msg","添加成功");
        return map;
    }

    @GetMapping("/deleteAddress")
    public String deleteAddress(@RequestParam(name = "aid",required = false)Long aid,@RequestParam(name = "uid",required = false)String uid){
        Map map = new HashMap();
        if(aid != null){
            map.put("aid",aid);
        }
        if(uid != null){
            map.put("uid",uid);
        }
        addressService.deleteAddress(map);
        return "改地址已被删除";
    }

    @PostMapping("/updateAddress")
    public String updateAddress(Address address){
        addressService.updateAddress(address);
        return "修改成功";
    }

    @GetMapping("/queryAddressbyuid")
    public List<Address> queryAddressbyuid(Long uid){
        Map map = new HashMap();
        map.put("uid",uid);
        return addressService.queryAddressbyuid(map);
    }

    @GetMapping("/queryaddress")
    public Map queryaddress(@RequestParam(name = "page",required = false)Integer page,@RequestParam(name = "count",required = false)Integer count,Address address) {
        Map map =new HashMap();
        if(address.getAid() != null){
            map.put("aid",address.getAid());
        }
        if(address.getUid() != null){
            map.put("uid",address.getUid());
        }
        if(address.getAddress() != null && address.getAddress() != ""){
            map.put("address",address.getAddress());
        }
        if(address.getPhone() != null && address.getPhone() != ""){
            map.put("phone",address.getPhone());
        }
        if(address.getUsername() != null && address.getUsername() != ""){
            map.put("username",address.getUsername());
        }
        if(page != null && count != null){
            map.put("min",(page-1)*count);
            map.put("max",count);
        }
        Map map1 = new HashMap();
        map1.put("total",addressService.countaddress(map));
        map1.put("address",addressService.queryAddress(map));
        return map1;
    }
}
