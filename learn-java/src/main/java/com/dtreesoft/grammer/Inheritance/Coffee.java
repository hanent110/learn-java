package com.dtreesoft.grammer.Inheritance;

public class Coffee {
    public String name = "Coffee";

    public void taste() {
        System.out.println("Coffee taste");

        doTaste();
    }

    public void temper() {
        temperature();
    }

    protected void temperature() {
        System.out.println("Coffee temperature is normal, name = " + name);
    }

    private void doTaste() {
        System.out.println("Coffee doTaste()");
    }
}
