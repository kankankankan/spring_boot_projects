package com.oyqh.model;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * Created by oyqh on 2017-1-5.
 */
@ApiModel(value = "UserInfo")
public class UserInfo implements Serializable {

    private String name;

    private String age;

    private String id;

    private Boolean sex;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", id='" + id + '\'' +
                ", sex=" + sex +
                '}';
    }
}