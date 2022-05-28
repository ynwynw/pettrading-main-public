package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Photo {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ppid; //宠物图片的id
    private String url;//宠物图片的地址
    private Long pid;//对应宠物的pid

//    @ManyToOne
//    @JoinColumn(name = "pid")
    private Pet pet;

}
