package com.dtreesoft.grammer.Inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("----------- americano test --------");

        Coffee americano = new Americano();
        System.out.println("----- americano = " + americano.name);
        americano.taste();

        Americano tempAme = (Americano) americano;
        System.out.println("----- tempAme = " + tempAme.name);
        tempAme.taste();

        System.out.println("-----------------------------------");
        System.out.println("----------- latte test ------------");

        Coffee latte = new Latte();
        System.out.println("----- latte = " + latte.name);
        latte.taste();

        Latte tempLatte = (Latte) latte;
        System.out.println("----- tempLatte = " + tempLatte.name);
        tempLatte.taste();
    }
}
