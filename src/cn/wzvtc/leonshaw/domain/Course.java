package cn.wzvtc.leonshaw.domain;

import com.alibaba.fastjson.annotation.JSONField;


public class Course {
    @JSONField(ordinal = 1)
    private Integer id;
    @JSONField(ordinal = 2)
    private String code;
    @JSONField(ordinal = 3)
    private String name;
    @JSONField(ordinal = 4)
    private Integer credit;
    @JSONField(ordinal = 5)
    private Integer hour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }
}