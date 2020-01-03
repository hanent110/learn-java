package com.dtreesoft.grammer.exception;

public class Board {
    private String name;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Board() {
        this("noname");
    }

    public Board(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "\"name\":\"" + name + '\"' +
                ", \"speed\":" + speed +
                '}';
    }
}
