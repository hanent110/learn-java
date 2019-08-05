package com.dtreesoft.grammer.Inheritance;

public class Americano extends Coffee {
    public String name = "Americano";

//    @Override
//    public void taste() {
//        System.out.println("Americano taste == " + name);
//
//        temper();
//    }

//    protected void temperature() {
//        System.out.println("Americano temperature is cold");
//    }

    private void doTaste() {
        System.out.println("Americano doTaste()");
    }
}
