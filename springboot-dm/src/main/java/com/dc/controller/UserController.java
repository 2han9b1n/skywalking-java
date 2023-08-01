package com.dc.controller;

import com.dc.entity.TestUser;
import com.dc.service.UserService;
import com.dc.utill.*;
import com.dc.utill.PoiOutUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wzj
 * @Date: 2020/5/18 17:29
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    public List<TestUser> getUser(){
        return userService.getUser();
    }

    @RequestMapping("/add")
    public Integer addUser(){
        List<TestUser> users = new ArrayList<TestUser>();
        String name = "lkscc";
        for (int i = 0 ;i<3 ;i++){
            TestUser user = new TestUser();
            user.setUid(33+i);
            user.setUname(name);
            name+=i;
            users.add(user);
        }
        return userService.addUser(users);
    }




}
