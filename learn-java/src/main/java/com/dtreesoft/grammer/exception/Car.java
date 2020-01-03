package com.dtreesoft.grammer.exception;

public class Car {
    public Board createBoard() {
        Board board = new Board();

        try {
            board.setSpeed(10);

            if (false) {
                throw new Exception();
            }

            return board;

        } catch (Exception e) {
            System.out.println("createBoard() in catch");
        } finally {
            // 1. Exception 이 발생하지 않았을 경우
            //      - a) 문장을 실행하지 않고 finally 안의 문장만 실행된 후 종료.
            // 2. Exception 이 발생하여 catch 구문을 탔을 경우
            //      - finally 안의 문장 실행 후 a) 문장을 실행하고 리턴을 실행한다.

            System.out.println("createBoard() in finally");
        }

        // a)
        System.out.println("createBoard() after finally before return");

        return new Board("After Finally Created Object");
    }
}
