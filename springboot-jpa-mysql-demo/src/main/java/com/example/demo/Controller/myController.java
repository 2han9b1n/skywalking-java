package com.example.demo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.alibaba.fastjson.JSONArray;
import com.example.demo.Entity.Test_user;
import com.example.demo.Repository.Test_jpa;


//申明Controller -

@Controller
public class myController {

    @Autowired
    Test_jpa da;


    //申明路由
    @GetMapping("/get")
    public String get(){
        List<Test_user> all = da.findAll();
        JSONArray a = new JSONArray();
        for(Test_user i : all){a.add(i);}
        return a.toJSONString();
    }

    @ResponseBody
    @GetMapping("/upload")
    public void postMethodName() {
        Test_user temp=new Test_user();
        temp.setName("张斌");
        temp.setId((int) System.currentTimeMillis()+23);
        temp.setNo(System.currentTimeMillis());
        da.save(temp);

    }


}
