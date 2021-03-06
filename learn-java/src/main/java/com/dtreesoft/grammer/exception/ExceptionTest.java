package com.dtreesoft.grammer.exception;

public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        exceptionTest.finallyTest();
        exceptionTest.finallyJustReturnTest();
        exceptionTest.finallyObjectReturnTest();
        exceptionTest.finallyLocalVariableReturnTest();
    }

    public void finallyTest() {
        Car newCar = new Car();
        Board board = newCar.createBoard();

        System.out.println("board = " + board);
        System.out.println("------------------------ finallyTest() end");
    }

    public void finallyJustReturnTest() {
        Car newCar = new Car();
        int retValue = newCar.finallyJustReturnTest();

        System.out.println("return value = " + retValue);
        System.out.println("------------------------ finallyJustReturnTest() end");
    }

    public void finallyObjectReturnTest() {
        Car newCar = new Car();
        Board board = newCar.finallyObjectReturnTest();
        System.out.println("board = " + board);
        System.out.println("------------------------ finallyObjectReturnTest() end");
    }

    public void finallyLocalVariableReturnTest() {
        Car newCar = new Car();
        int retValue = newCar.finallyLocalVariableReturnTest();

        System.out.println("return value = " + retValue);
        System.out.println("------------------------ finallyLocalVariableReturnTest() end");
    }
}
