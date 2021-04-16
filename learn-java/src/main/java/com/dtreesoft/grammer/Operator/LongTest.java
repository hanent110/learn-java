package com.dtreesoft.grammer.Operator;

public class LongTest {

    public void runTest() {
        Long longVal_10_a = 10L;
        Long longVal_10_b = 10L;

        Long longVal_127_a = 127L;
        Long longVal_127_b = 127L;

        Long longVal_128_a = 128L;
        Long longVal_128_b = 128L;

        Long longVal_10000_a = 10000L;
        Long longVal_10000_b = 10000L;

        // longVal_10_a == longVal_10_b
        if (longVal_10_a == longVal_10_b) {
            System.out.println("longVal_10_a == longVal_10_b");
        } else {
            System.out.println("longVal_10_a != longVal_10_b");
        }

        // longVal_127_a == longVal_127_b
        if (longVal_127_a == longVal_127_b) {
            System.out.println("longVal_127_a == longVal_127_b");
        } else {
            System.out.println("longVal_127_a != longVal_127_b");
        }

        // longVal_128_a != longVal_128_b
        if (longVal_128_a == longVal_128_b) {
            System.out.println("longVal_128_a == longVal_128_b");
        } else {
            System.out.println("longVal_128_a != longVal_128_b");
        }


        // longVal_10000_a != longVal_10000_b
        if (longVal_10000_a == longVal_10000_b) {
            System.out.println("longVal_10000_a == longVal_10000_b");
        } else {
            System.out.println("longVal_10000_a != longVal_10000_b");
        }

        // longVal_10000_a == 10000
        if (longVal_10000_a == 10000) {
            System.out.println("longVal_10000_a == 10000");
        } else {
            System.out.println("longVal_10000_a != 10000");
        }

        // longVal_10000_a.longValue() == longVal_10000_b.longValue()
        if (longVal_10000_a.longValue() == longVal_10000_b.longValue()) {
            System.out.println("longVal_10000_a.longValue() == longVal_10000_b.longValue()");
        } else {
            System.out.println("longVal_10000_a.longValue() != longVal_10000_b.longValue()");
        }

        // longVal_10000_a.longValue() == 10000
        if (longVal_10000_a.longValue() == 10000) {
            System.out.println("longVal_10000_a.longValue() == 10000");
        } else {
            System.out.println("longVal_10000_a.longValue() != 10000");
        }
    }
}
