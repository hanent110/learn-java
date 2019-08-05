package com.dtreesoft.grammer.Inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("----------- coffee test -----------");

        Coffee coffee = new Americano();
        System.out.println("---- coffee = " + coffee.name);
        coffee.taste();

        Americano americano = (Americano) coffee;
        System.out.println("---- americano = " + americano.name);
        americano.taste();

        System.out.println("-----------------------------------");
        System.out.println("----------- latte test ------------");

        Coffee latte = new Latte();
        System.out.println("---- latte = " + latte.name);
        latte.taste();

        Latte tempLatte = (Latte) latte;
        System.out.println("---- tempLatte = " + tempLatte.name);
        tempLatte.taste();

        System.out.println();
    }
}
