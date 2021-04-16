package com.dtreesoft.grammer.Operator;

public class DoubleTest {


    public void runTest() {
        formatTest();
    }

    /**
     *  String.format 으로 변환시
     *  설정한 값의 바로 아래 자리에서 반올림해서 결정된다.
     *  원래 double 값 : 5.007664793050588
     *    %.2f = 5.01 (7 이 반올림 되어 1 올라감)
     *    %.5f = 5.00766 (4 가 반올림 되어 없어짐)
     */
    private void formatTest() {
        double result = (double)196 / (double) 3914 * 100.0;
        System.out.println("result = " + result);

        String format2 = String.format("%.2f", result);
        System.out.println("format2 = " + format2);

        String format5 = String.format("%.5f", result);
        System.out.println("format5 = " + format5);
    }

}
