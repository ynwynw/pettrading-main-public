package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;
import java.util.List;

//@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SKind {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skid;
    private String savatar;
    private String skindname;
    private Long bkid;//对应种类的bkid

//    @ManyToOne
//    @JoinColumn(name = "bkid")
    private BKind bkind;

//    @OneToMany(mappedBy = "skind")
    private List<Pet> pet;
}
