package com.lg.springsource.beans;

/**
 * Created by liuguo on 2017/4/18.
 */
public class User {
    private String username;
    private String email;

    private int age;

    public User(String username, String email) {
        System.out.println("User带参构造参数...");
        this.username = username;
        this.email = email;
    }

    public User() {
        System.out.println("User默认构造函数...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String test(String test){
        return test;
    }

    public final String finalTest(String test){
        return test;
    }
}
