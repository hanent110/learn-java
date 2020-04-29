package com.dtreesoft.grammer.exception;

public class Car {
    private final static boolean IS_THROW_EXCEPTION = true;

    public Board createBoard() {
        Board board = new Board();
        try {
            board.setSpeed(10);

            if (IS_THROW_EXCEPTION) {
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

    public int finallyJustReturnTest() {
        // 실제 primitive type 의 값을 리턴 할 경우
        // Exception 발생 유무와 상관없이 finally 에서 리턴된 값이 적용된다.

        try {
            if (IS_THROW_EXCEPTION) {
                throw new Exception();
            }

            System.out.println("finallyReturnTest() return 1 at try");
            return 1;

        } catch (Exception e) {

            System.out.println("finallyReturnTest() return 2 at catch");
            return 2;

        } finally {

            System.out.println("finallyReturnTest() return 3 at finally");
            return 3;
        }
    }

    public int finallyLocalVariableReturnTest() {
        // primitive type 의 로컬 변수에 값을 지정하고 catch 에서 그 변수를 리턴한 후
        // finally 에서 로컬 변수값을 변경했을 경우
        // try 혹은 catch 에서 return 할때의 값이 적용된다.

        int retValue = 1;

        try {
            if (IS_THROW_EXCEPTION) {
                throw new Exception();
            }
            retValue = 1;
            System.out.println("finallyReturnTest() return 1 at try");
            return retValue;

        } catch (Exception e) {
            retValue = 2;
            System.out.println("finallyReturnTest() return 2 at catch");
            return retValue;

        } finally {
            retValue = 3;
            System.out.println("finallyReturnTest() return 3 at finally");
        }
    }
}
