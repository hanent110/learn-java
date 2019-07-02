package com.dtreesoft.grammer.calculate;

public class CalcTest {
    public static void main(String[] args) {
        CalcTest calcTest = new CalcTest();
        calcTest.mainTest();
    }

    private void mainTest() {
//        long overCoin = 120000000000L;
        long overCoin = 199999999999L;

        long count = overCoin / 100000000000L;
        long remain = overCoin % 100000000000L;

        System.out.println("count= " + count + ", remain= " + remain);
    }
}
