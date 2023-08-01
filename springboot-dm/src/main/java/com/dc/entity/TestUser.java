package com.dc.entity;

/**
 * @Author: wzj
 * @Date: 2020/5/18 17:21
 */
public class TestUser {

    public TestUser() {

    }
    public TestUser(Integer uid,String uname) {
        this.uid=uid;
        this.uname=uname;
    }

    private Integer uid;
    private String uname;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "TestUser{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                '}';
    }
}
