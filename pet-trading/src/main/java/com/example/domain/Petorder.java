package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;
import java.util.Date;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Petorder {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long poid;
    private Long uid;//买家uid
    private Long pid;//订单宠物id
    private Long puid;//卖家uid
    private String phone;
    private String address;
    private String recipientname;
    private String newphone;
    private String newaddress;
    private String newrecipientname;
    private Date date;
    private Double price;//下单时的宠物价格
    private Integer postatu;//0-进行中，1-已完成，2-已取消，3-修改中，4-取消中
//    @ManyToOne
//    @JoinColumn(name = "uid")
    private User user;
    private Pet pet;
}
