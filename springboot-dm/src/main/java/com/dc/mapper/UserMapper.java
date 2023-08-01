package com.dc.mapper;


import com.dc.entity.TestUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: wzj
 * @Date: 2020/5/18 17:23
 */
public interface UserMapper {
    /**
     * 查询全部数据
     */
    List<TestUser> getUser();

    Integer addUsers(@Param("users") List<TestUser> users);

}
