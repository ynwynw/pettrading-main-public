package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aid;
    private String phone;
    private String address;
    private String username;
    private Long uid;

//    @ManyToOne
//    @JoinColumn(name = "uid")
    private User user;
}
