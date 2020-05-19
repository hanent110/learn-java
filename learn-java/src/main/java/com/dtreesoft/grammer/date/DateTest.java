package com.dtreesoft.grammer.date;

import com.dtreesoft.grammer.exception.Board;
import com.dtreesoft.grammer.exception.Car;
import com.dtreesoft.grammer.exception.ExceptionTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        DateTest dateTest = new DateTest();

        dateTest.finallyTest();
        dateTest.calcDate();
    }

    public void finallyTest() {
        System.out.println("---- finallyTest() begin");
        Date date_empty = new Date();   // 현재시간 설정됨.
        Date date_0 = new Date(0);      // epoch 0 시간이 설정됨.

        System.out.println("  - date_empty = " + date_empty);
        System.out.println("  - date_0 = " + date_0);
    }

    public void calcDate() {
        System.out.println("---- calcDate() begin");

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date withdrawDate = getDateFromString("2020-05-08 14:35:59");
        Date enableRegisterDate = getDateFromString("2020-05-15 14:35:59");
        System.out.println("  - withdrawDate: " + withdrawDate);
        System.out.println("  - enableRegisterDate: " + enableRegisterDate);

        Date minus7Date = getUnregisterDate();
        System.out.println("  - minus7Date: " + minus7Date);

        Calendar cal = Calendar.getInstance();
        System.out.println("  - cal: " + dateFormatter.format(cal.getTime()));
        cal.add(Calendar.DATE, -7);
        System.out.println("  - date: " + dateFormatter.format(cal.getTime()));
    }

    private Date getDateFromString(String dateString) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = null;
        try {
            date = dateFormatter.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

    private Date getUnregisterDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -7);

        return cal.getTime();
    }
}

