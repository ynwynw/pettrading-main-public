package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;
import java.util.Date;
import java.util.List;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;//宠物id
    private String petname;//宠物标题
    private String sex;//宠物性别
    private Double price;//宠物价格
    private Integer age;//宠物年龄
    private String description;//宠物描述
    private Integer pk;//宠物发售类型（0-出售中，1-已出售，2-已完成出售，3-发布求购中）
    private Long uid;//对应买家或卖家的uid
    private Long bkid;//对应种类的bkid
    private Long skid;//对应品种的skid
    private Date date;

//    @ManyToOne
//    @JoinColumn(name = "uid")
    private User user;//发布宠物的买家或卖家

//    @ManyToOne
//    @JoinColumn(name = "bkid")
    private BKind bkind;//宠物所属的类型

//    @ManyToOne
//    @JoinColumn(name = "skid")
    private SKind skind;//宠物所属的品种

//    @OneToMany(mappedBy = "pet")
    private List<Photo> photo;//宠物图片,最多5张

//    @OneToMany(mappedBy = "pet")
    private List<Petorder> petorder;
}
