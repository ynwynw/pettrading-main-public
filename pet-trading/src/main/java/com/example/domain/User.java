package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;
import java.util.List;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;//用户id
    private String avatar;//头像
    private Integer type;//0-管理员，1-普通用户
    private String username;//用户名
    private String realname;//真实姓名
    private String idcard;//身份证号
    private String sex;//性别
    private String password;//密码
    private String telphone;//联系电话
    private String email;//邮箱
    private String wechat;//微信
//    private String address;//收货地址

//    @OneToMany(mappedBy = "user")
    private List<Pet> pet;//用户上传的宠物

//    @OneToMany(mappedBy = "user")
    private List<Address> address;//收货地址

//    @OneToMany(mappedBy = "user")
    private List<Petorder> petorder;

//    @Temporal(TemporalType.TIMESTAMP) // 是用来定义日期类型
//    private Date birthday;//生日
}
