package com.demo.xiang.databinding.model;

/**
 * Created by Administrator on 2016/8/5.
 */
public class UserBean {
    private String name;
    private String age;
    private String nickName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public UserBean(String name, String age, String nickName) {
        this.name = name;
        this.age = age;
        this.nickName = nickName;
    }
}
