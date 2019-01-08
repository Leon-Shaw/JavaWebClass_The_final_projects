package cn.wzvtc.leonshaw.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class User {
    @JSONField(ordinal = 1)
    private String id;
    @JSONField(ordinal = 2)
    private String username;
    @JSONField(ordinal = 3)
    private String password;
    @JSONField(ordinal = 4)
    private String sex;
    @JSONField(ordinal = 5)
    private int age;
    @JSONField(format = "yyyy/MM/dd", ordinal = 6)
    private Date birthday;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
