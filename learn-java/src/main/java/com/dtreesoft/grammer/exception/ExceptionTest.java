package com.dtreesoft.grammer.exception;

public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();

        exceptionTest.finallyTest();
    }

    public void finallyTest() {
        Car newCar = new Car();
        Board board = newCar.createBoard();

        System.out.println("board = " + board);

        System.out.println("finallyTest() end");
    }
}
