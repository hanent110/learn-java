package com.dtreesoft.grammer.Inheritance;

public class Americano extends Coffee {
    public String name = "Americano";
    public int price;

    public Americano(int price) {
        System.out.println("americano create");
        this.price = price;
    }

    @Override
    public void taste() {
        System.out.println("Americano taste");

        doTaste();
    }

//    protected void temperature() {
//        System.out.println("Americano temperature is cold");
//    }

    public void doTaste() {
        System.out.println("Americano doTaste()");
    }
}
