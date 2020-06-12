package com.dtreesoft.grammer.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateSimpleTest {
    public static void main(String[] args) {
        DateSimpleTest dateTest = new DateSimpleTest();

        dateTest.calendarSetTest();
        dateTest.calendarSetMinusTest();
    }

    public void calendarSetTest() {
        System.out.println("---- calendarSetTest() begin");

        Calendar beforeMonthCheckDate = Calendar.getInstance();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        System.out.println(String.format("  - year: %d, month: %d", year, month));

        beforeMonthCheckDate.set(Calendar.getInstance().get(Calendar.YEAR), Calendar.getInstance().get(Calendar.MONTH) - 1,
                20, 6, 0, 0);

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("  - beforeMonthCheckDate: " + dateFormatter.format(beforeMonthCheckDate.getTime()));
    }

    /**
     * Calendar set 할때 month 에 음수값을 넣으면 전년도로 바뀐다.
     */
    public void calendarSetMinusTest() {
        System.out.println("---- calendarSetMinusTest() begin");

        Calendar beforeMonthCheckDate = Calendar.getInstance();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        System.out.println(String.format("  - year: %d, month: %d", year, month));

        beforeMonthCheckDate.set(Calendar.getInstance().get(Calendar.YEAR), Calendar.JANUARY - 1,
                20, 6, 0, 0);

        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("  - beforeMonthCheckDate: " + dateFormatter.format(beforeMonthCheckDate.getTime()));
    }
}
