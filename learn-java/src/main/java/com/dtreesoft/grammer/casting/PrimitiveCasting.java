package com.dtreesoft.grammer.casting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        PrimitiveCasting test = new PrimitiveCasting();
        test.runTest();
    }

    private void runTest() {
        int intValue = 33;
        long longValue = 44;
        String test = "";

        test += "int: " + intValue + "\n";
        test += "int: " + intValue + "\n";
        test += "int to long: " + (long) intValue + "\n";

        System.out.println(test);

        funcIntParam(12345);

        funcPrimitiveLongParam(12345678);   // long 형으로 형변환은 가능하지만.

//        funcLongParam(5678);             // Long 형으로 형변환은 불가능.

        funcLongParam(Long.valueOf(String.valueOf(5678)));
    }

    private void funcLongParam(Long i) {
//        int intA = (Integer) i;   // Integer 형을 Long 형으로 캐스팅 불가.
//        int intB = (int) i;       // int 형을 Long 형으로 캐스팅 불가.
    }

    private void funcPrimitiveLongParam(long pA) {
        int intA = (int) pA;

        System.out.println("funcLongParam, intA = " + intA);
    }

    private void funcIntParam(Integer pA) {
        long longA = (long) pA;

        System.out.println("funcIntParam, longA = " + longA);
    }
}
