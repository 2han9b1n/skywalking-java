package com.example.demo.Entity;


import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

//自动生成实体类表
@Entity

//lombook设置getter和setter
@Getter
@Setter

public class Test_user {
    
    @Id
    @GeneratedValue
    int Id;


    long No;

    String Name;
    
}
