package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Test_user;

//申明repository
@Repository

//jpa负责连接数据库， 不用关心具体实现
public interface Test_jpa  extends JpaRepository<Test_user, Integer>{
    
}
