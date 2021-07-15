package com.post.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Users {

    private String name;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private int age;

    @JsonProperty("phone_number")
    private String phoneNumber;

    public Users() {
        this.name = null;
        this.age = 0;
        this.phoneNumber = null;
    }

    public Users(String name, int age, String phoneNumber) {
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "objectMapper{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
