package com.dtreesoft.grammer.Operator;

public class IfTest {

    public void runTest() {
        ifTest();
    }

    /**
     *  String.format 으로 변환시
     *  설정한 값의 바로 아래 자리에서 반올림해서 결정된다.
     *  원래 double 값 : 5.007664793050588
     *    %.2f = 5.01 (7 이 반올림 되어 1 올라감)
     *    %.5f = 5.00766 (4 가 반올림 되어 없어짐)
     */
    private void ifTest() {
        if (first() || second() && third()) {
            System.out.println("ifTest = " + true);
        } else {
            System.out.println("ifTest = " + false);
        }
    }

    private boolean first() {
        System.out.println("IfTest.first");
        return false;
    }

    private boolean second() {
        System.out.println("IfTest.second");
        return true;
    }

    private boolean third() {
        System.out.println("IfTest.third");
        return false;
    }

}
