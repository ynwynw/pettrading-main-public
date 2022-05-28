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
@SuppressWarnings("all")//抑制所有警告
public class BKind {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bkid;
    private String bavatar;
    private String bkindname;

//    @OneToMany(mappedBy = "bkind")
    private List<Pet> pet;

//    @OneToMany(mappedBy = "bkind")
    private List<SKind> skind;
}
