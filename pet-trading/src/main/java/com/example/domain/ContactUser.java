package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactUser {

    private Long cid;
    private Long uid;
    private String username;
    private String avatar;
    private Integer noread;
}
