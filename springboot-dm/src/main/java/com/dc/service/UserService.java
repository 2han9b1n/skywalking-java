package com.dc.service;

import com.dc.entity.TestUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wzj
 * @Date: 2020/5/18 17:27
 */
@Service
public interface UserService {
    /**
     * 查询所有数据
     * @return
     */
    List<TestUser> getUser();

    /**
     * 批量新增
     * @param users
     * @return
     */
    Integer addUser(List<TestUser> users);
}
