package com.example.entity;

public class User {
    private String name;
    private Integer age;
    private String pwd;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
