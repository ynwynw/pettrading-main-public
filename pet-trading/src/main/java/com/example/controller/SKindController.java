package com.example.controller;

import com.example.domain.SKind;
import com.example.service.SKindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/skind")
public class SKindController {

    @Autowired
    private SKindService sKindService;

    @PostMapping("/addskind")
    public Map addSKind(SKind skind){
        sKindService.addSKind(skind);
        Map map = new HashMap();
        map.put("skid",skind.getSkid());
        map.put("msg","种类添加成功");
        return map;
    }

    @GetMapping("/deleteskind")
    public String deleteSKind(Long skid){
        Map map = new HashMap();
        map.put("skid",skid);
        sKindService.deleteSKind(map);
        return "品种删除成功";
    }

    @PostMapping("/updateskind")
    public String updateSKind(SKind skind){
        sKindService.updateSKind(skind);
        return "种类修改成功";
    }

    @GetMapping("/queryallskind")
    public List<SKind> queryAllSKind(SKind sKind){
        Map map = new HashMap();
        if(sKind.getBkid() != null){
            map.put("bkid",sKind.getBkid());
        }
        if(sKind.getSkid() != null) {
            map.put("skid",sKind.getSkid());
        }
        if(sKind.getSkindname() != null && sKind.getSkindname() != "") {
            map.put("skindname",sKind.getSkindname());
        }
        return sKindService.queryAllSKind(map);
    }
}
