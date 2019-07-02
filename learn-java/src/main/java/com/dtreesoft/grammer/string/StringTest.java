package com.dtreesoft.grammer.string;

import java.text.DecimalFormat;

public class StringTest {
    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        stringTest.mainTest();
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
}
