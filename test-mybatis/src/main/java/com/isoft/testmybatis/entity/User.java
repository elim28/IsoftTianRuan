package com.isoft.testmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String password;
    private Date regdatetime;
    private Integer status;
    private String photourl;
    private String email;
    private String mobile;
    private String activecode;

}
