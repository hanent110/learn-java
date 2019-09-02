package com.dtreesoft.grammer.moduler;

public class ModulerTest {
    public static void main(String[] args) {
        integerModularTest();

        doubleModularTest();
    }

    private static void integerModularTest() {
        int a = 20;
        int b = -20;

        int resultA = a % 11;
        int resultB = b % 11;

        System.out.println("a % 3 = " + resultA);
        System.out.println("b % 3 = " + resultB);
    }

    private static void doubleModularTest() {
        double a = 20.1;
        double b = -20.1;

        double resultA = a % 11.2;
        double resultB = b % 11.2;

        System.out.println("a % 3 = " + resultA);
        System.out.println("b % 3 = " + resultB);
    }
}
