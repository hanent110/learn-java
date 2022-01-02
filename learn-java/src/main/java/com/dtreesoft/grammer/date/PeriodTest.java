package com.dtreesoft.grammer.date;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

    public static void main(String[] args) {
        PeriodTest periodTest = new PeriodTest();
        periodTest.test();
    }

    private void test() {
        long lastAttendance = 1631238165056L;
        LocalDate lastAttendanceDate = new Timestamp(lastAttendance).toLocalDateTime().toLocalDate();
        LocalDate now = LocalDate.now();

        Period between = Period.between(lastAttendanceDate, now);

        System.out.println("between.getDays = " + between.getDays());
    }
}
