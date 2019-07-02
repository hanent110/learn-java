package com.dtreesoft.grammer.Operator;

public class IntegerTest {
    public void runTest() {
        Integer intVal_10_a = 10;
        Integer intVal_10_b = 10;

        Integer intVal_127_a = 127;
        Integer intVal_127_b = 127;

        Integer intVal_128_a = 128;
        Integer intVal_128_b = 128;

        Integer intVal_10000_a = 10000;
        Integer intVal_10000_b = 10000;

        // intVal_10_a == intVal_10_b
        if (intVal_10_a == intVal_10_b) {
            System.out.println("intVal_10_a == intVal_10_b");
        } else {
            System.out.println("intVal_10_a != intVal_10_b");
        }

        // intVal_127_a == intVal_127_b
        if (intVal_127_a == intVal_127_b) {
            System.out.println("intVal_127_a == intVal_127_b");
        } else {
            System.out.println("intVal_127_a != intVal_127_b");
        }

        // intVal_128_a != intVal_128_b
        if (intVal_128_a == intVal_128_b) {
            System.out.println("intVal_128_a == intVal_128_b");
        } else {
            System.out.println("intVal_128_a != intVal_128_b");
        }


        // intVal_10000_a != intVal_10000_b
        if (intVal_10000_a == intVal_10000_b) {
            System.out.println("intVal_10000_a == intVal_10000_b");
        } else {
            System.out.println("intVal_10000_a != intVal_10000_b");
        }

        // intVal_10000_a == 10000
        if (intVal_10000_a == 10000) {
            System.out.println("intVal_10000_a == 10000");
        } else {
            System.out.println("intVal_10000_a != 10000");
        }

        // intVal_10000_a.intValue() == intVal_10000_b.intValue()
        if (intVal_10000_a.intValue() == intVal_10000_b.intValue()) {
            System.out.println("intVal_10000_a.intValue() == intVal_10000_b.intValue()");
        } else {
            System.out.println("intVal_10000_a.intValue() != intVal_10000_b.intValue()");
        }

        // intVal_10000_a.intValue() == 10000
        if (intVal_10000_a.intValue() == 10000) {
            System.out.println("intVal_10000_a.intValue() == 10000");
        } else {
            System.out.println("intVal_10000_a.intValue() != 10000");
        }
    }
}
