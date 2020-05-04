package com.dtreesoft.grammer.exception;

public class Car {
    private final static boolean IS_THROW_EXCEPTION = false;

    public Board createBoard() {
        // 1. Exception 이 발생하지 않았을 경우
        //      - a) 문장을 실행하지 않고 finally 안의 문장만 실행된 후 종료.
        // 2. Exception 이 발생하여 catch 구문을 탔을 경우
        //      - finally 안의 문장 실행 후 a) 문장을 실행하고 리턴을 실행한다.
        // 3. Exception 이 발생하여 catch 구문을 탔을 경우
        //      - catch 구문에 return 문이 있으면 위 2번 결과처럼 진행되지 않고 finally 구문만 실행후 종료된다.
        //      - 즉 a) 문장이 실행되지 않을 뿐더러 compile Error 발생.

        Board board = new Board("try");
        try {
            board.setSpeed(10);

            if (IS_THROW_EXCEPTION) {
                throw new Exception();
            }

            return board;

        } catch (Exception e) {
            System.out.println("catch phase");
        } finally {
            System.out.println("finally phase");
        }

        // a)
        System.out.println("createBoard() after finally before return");

        return new Board("After Finally");
    }

    public int finallyJustReturnTest() {
        // 실제 primitive type 의 값을 리턴 할 경우
        // Exception 발생 유무와 상관없이 finally 에서 리턴된 값이 적용된다.

        try {
            if (IS_THROW_EXCEPTION) {
                throw new Exception();
            }

            System.out.println("try : finallyReturnTest() return 1");
            return 1;

        } catch (Exception e) {

            System.out.println("catch : finallyReturnTest() return 2");
            return 2;

        } finally {

            System.out.println("finally : finallyReturnTest() return 3");
            return 3;
        }
    }

    public Board finallyObjectReturnTest() {
        // Exception 발생시 catch 와 finally 두 곳에서 모두 return 했을 경우 finally 것이 적용된다.

        try {
            if (IS_THROW_EXCEPTION) {
                throw new Exception();
            }

            System.out.println("try : finallyReturnTest() return");
            return new Board("try");

        } catch (Exception e) {

            System.out.println("catch : finallyReturnTest() return");
            return new Board("catch");

        } finally {

            System.out.println("finally : finallyReturnTest() return");
            return new Board("finally");
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
            System.out.println("try : finallyReturnTest() return 1");
            return retValue;

        } catch (Exception e) {
            retValue = 2;
            System.out.println("catch : finallyReturnTest() return 2");
            return retValue;

        } finally {
            retValue = 3;
            System.out.println("finally : finallyReturnTest() set 3");
        }
    }
}
