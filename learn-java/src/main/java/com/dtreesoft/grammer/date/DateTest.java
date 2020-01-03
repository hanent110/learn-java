package com.dtreesoft.grammer.date;

import com.dtreesoft.grammer.exception.Board;
import com.dtreesoft.grammer.exception.Car;
import com.dtreesoft.grammer.exception.ExceptionTest;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        DateTest dateTest = new DateTest();

        dateTest.finallyTest();
    }

    public void finallyTest() {
        Date date_empty = new Date();   // 현재시간 설정됨.
        Date date_0 = new Date(0);      // epoch 0 시간이 설정됨.

        System.out.println("date_empty = " + date_empty);
        System.out.println("date_0 = " + date_0);
    }


}
