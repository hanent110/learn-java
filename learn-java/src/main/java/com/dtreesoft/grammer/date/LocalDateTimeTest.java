package com.dtreesoft.grammer.date;

import com.sun.javafx.binding.StringFormatter;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class LocalDateTimeTest {
    public static void main(String[] args) {
        LocalDateTimeTest localDateTimeTest = new LocalDateTimeTest();
        localDateTimeTest.mainTest();
    }

    private void mainTest() {
        LocalDateTime now = LocalDateTime.now();
        String stringNow = now.toString();
        System.out.println(stringNow);

        LocalDateTime convNow = LocalDateTime.parse(stringNow);
        System.out.println(convNow.toString());

        minusTest();

        localDateTest();
    }

    private void localDateTest() {
        LocalDate today = LocalDate.now();
        System.out.println("localDateTest today: " + today.toString());     // 2021-01-20

        String todayString = today.toString();

        LocalDate parseDate = LocalDate.parse(todayString);
        System.out.println("localDateTest parse: " + parseDate);

        try {
            LocalDate invalidParseDate = LocalDate.parse("todayString");
            System.out.println("localDateTest invalidParseDate: " + invalidParseDate);
        } catch (Exception e) {
            System.out.println(e);
        }

        boolean equalResult = today.isEqual(parseDate);
        System.out.println("localDateTest equalResult: " + equalResult);
    }

    private void minusTest() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime minusDate = now.minusDays(7);

        System.out.println(String.format("minusTest, now: {%s}, minusDate: {%s}", now, minusDate));
    }

    private void dateToLocalDateTime() {
        Date tempDate = new Date();
        LocalDateTime lastDate = new Timestamp(tempDate.getTime()).toLocalDateTime();
    }
}
