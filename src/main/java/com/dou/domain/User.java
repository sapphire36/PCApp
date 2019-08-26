package com.dou.domain;

/**
 * 用户信息
 */
public class User {
    // 成员变量
    private Integer userid;
    private String name;
    private String password;

    // 构造函数
    public User() {
        super();
    }

    public User(Integer userid, String username, String password) {
        super();
        this.userid = userid;
        this.name = username;
        this.password = password;
    }

    // 成员方法
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return name;
    }

    public void setUsername(String username) {
        this.name = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}