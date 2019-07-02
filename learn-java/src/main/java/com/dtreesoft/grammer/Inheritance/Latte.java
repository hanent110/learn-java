package com.dtreesoft.grammer.Inheritance;

public class Latte extends Coffee {
    public String name = "Latte";

    @Override
    public void taste() {
        System.out.println("Latte taste");

        temper();
    }

//    protected void temperature() {
//        System.out.println("Latte temperature is hot");
//    }
}
