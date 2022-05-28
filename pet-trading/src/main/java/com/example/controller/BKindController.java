package com.example.controller;

import com.example.domain.BKind;
import com.example.service.BKindService;
import com.example.service.PetService;
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
@RequestMapping("/bkind")
public class BKindController {

    @Autowired
    private BKindService BKindService;
    @Autowired
    private PetService petService;
    @Autowired
    private SKindService sKindService;

    @PostMapping("/addBKind")
    public Map addBKind(BKind bkind){
        BKindService.addBKind(bkind);
        Map map = new HashMap();
        map.put("bkid",bkind.getBkid());
        map.put("msg","类型添加成功");
        return map;
    }

    @GetMapping("/deleteBKind")
    public String deleteBKind(Long bkid){
        Map map = new HashMap();
        petService.setPetbkidNULL(bkid);
        map.put("bkid",bkid);
        sKindService.deleteSKind(map);
        BKindService.deleteBKind(bkid);
        return "类型删除成功";
    }

    @GetMapping("/updateBKind")
    public String updateBKind(BKind kind){
        BKindService.updateBKind(kind);
        return "类型修改成功";
    }

    @GetMapping("/queryBKind")
    public List<BKind> queryBKind(){
        List<BKind> kind = BKindService.queryBKind();
        return kind;
    }

    @GetMapping("/queryBKindname")
    public List<Map> queryBKindname(){
        List<Map> map = BKindService.queryBKindname();
        return map;
    }

    @GetMapping("/queryBKindandSKind")
    public List<BKind> queryBKindandSKind(BKind bkind){
        Map map = new HashMap();
        if(bkind.getBkid() != null) {
            map.put("bkid",bkind.getBkid());
        }
        if(bkind.getBkindname() != null && bkind.getBkindname() != "") {
            map.put("bkindname",bkind.getBkindname());
        }
        return BKindService.queryBKindandSKind(map);
    }
}
