package com.dtreesoft.grammer.Inheritance;

public class Coffee {
    public String name = "Coffee";
    public int price;

    public Coffee() {
        System.out.println("coffee create");
    }

    public Coffee(int price) {
        this.price = price;
        System.out.println("coffee create with parameter");
    }

    public int getPrice() {
        return price;
    }

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

    public void doTaste() {
        System.out.println("Coffee doTaste()");
    }
}
