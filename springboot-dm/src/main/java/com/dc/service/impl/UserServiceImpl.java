package com.dc.service.impl;

import com.dc.entity.TestUser;
import com.dc.mapper.UserMapper;
import com.dc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: wzj
 * @Date: 2020/5/18 17:28
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<TestUser> getUser() {
        return userMapper.getUser();
    }

    @Override
    public Integer addUser(List<TestUser> users) {
        return userMapper.addUsers(users);
    }
}
