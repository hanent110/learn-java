package com.dtreesoft.grammer.optional;

public class User {
    private Long userId;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public User(Long userId, String name) {
        this.userId = userId;
        this.name = name;
    }
}
