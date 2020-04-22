package com.dtreesoft.grammer.casting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        PrimitiveCasting test = new PrimitiveCasting();
        test.nullCasting();
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
    }

    private void primitiveObjectCasting() {
        int primitiveInt = 10;
        Integer objectInt = 20;
        long primitiveLong = 30L;
        Long objectLong = 40L;

        primitiveInt = (int) primitiveLong;         // long -> int 가능
//        primitiveInt = (int) objectLong;          // Long -> int 불가능
        primitiveLong = (long) primitiveInt;        // int -> long 가능
        primitiveLong = (long) objectInt;           // Integer -> long 가능
    }

    private void stringCasting() {
        long primitiveLong1 = Long.valueOf(String.valueOf(5678));
        long primitiveLong2 = Long.parseLong(String.valueOf(5678));
    }

    private void nullCasting() {
        Integer objectInt = null;
        int primitiveInt = 0;

//        primitiveInt = objectInt;     // EXCEPTION: 당연히 NullPointerException 발생
        System.out.println(objectInt);  // print > "null"
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
