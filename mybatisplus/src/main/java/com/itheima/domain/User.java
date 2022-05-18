package com.itheima.domain;

import lombok.Data;

@Data
public class User {
    private long id;
    public String name;
    public String password;
    public Integer age;
    public String tel;
}
