package com.dtreesoft.grammer.string;

import java.text.DecimalFormat;

public class StringTest {
    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        stringTest.mainTest();
        stringTest.formatTest();
    }

    private void mainTest() {
        DecimalFormat formatter = new DecimalFormat("###,###");

        String a = formatter.format(123456);
        String b = formatter.format(123456789);
        String c = formatter.format(123456789101112123L);

        System.out.println("a = " + a );
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    private void formatTest() {
        String s = String.format("%s%04d", "NARO", 1);
        System.out.println("s = " + s); // output: s = NARO0001

        String s2 = String.format("%S%04d", "NARO", 1);
        System.out.println("s2 = " + s2); // output: s2 = NARO0001

        String s3 = String.format("%s%04d", "naro", 1);
        System.out.println("s3 = " + s3); // output: s3 = naro0001

        String s4 = String.format("%S%04d", "naro", 1);
        System.out.println("s4 = " + s4); // output: s4 = NARO0001
    }
}
