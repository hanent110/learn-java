package com.dtreesoft.grammer.date;

import java.sql.Timestamp;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class LocalDateTimeTest {

    public static void main(String[] args) {
        LocalDateTimeTest localDateTimeTest = new LocalDateTimeTest();
        localDateTimeTest.mainTest();
        localDateTimeTest.minusTest();
        localDateTimeTest.localDateTest();
        localDateTimeTest.epochTest();
        localDateTimeTest.diffDay();
    }

    private void mainTest() {
        LocalDateTime now = LocalDateTime.now();
        String stringNow = now.toString();
        System.out.println(stringNow);  // 2021-03-18T11:00:24.785

        LocalDateTime convNow = LocalDateTime.parse(stringNow);
        System.out.println(convNow.toString());
    }

    private void localDateTest() {
        LocalDate today = LocalDate.now();
        System.out.println("localDateTest today: " + today.toString());     // 2021-03-18

        String todayString = today.toString();

        LocalDate parseDate = LocalDate.parse(todayString);
        System.out.println("localDateTest parse: " + parseDate);            // 2021-03-18

        try {
            LocalDate invalidParseDate = LocalDate.parse("todayString"); // DateTimeParseException 발생.
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

    private void epochTest() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);

        long epochMilli = now.toInstant(ZoneOffset.of("+09:00")).toEpochMilli();
        System.out.println("epochMilli = " + epochMilli);

        LocalDateTime time1 = LocalDateTime.of(2021, 3, 18, 11, 10, 00);
        LocalDateTime time2 = LocalDateTime.of(2021, 3, 18, 11, 11, 00);

        long between = ChronoUnit.MILLIS.between(time1, time2);
        System.out.println("between = " + between);

        long between2 = ChronoUnit.MILLIS.between(time2, time1);
        System.out.println("between2 = " + between2);

        long instantNow = Instant.now().toEpochMilli();
        System.out.println("instantNow = " + instantNow);
    }

    private void diffDay() {
        LocalDateTime before = LocalDateTime.of(2021, 9, 2, 23, 59, 59);
        LocalDateTime after = LocalDateTime.of(2021, 9, 3, 0, 1, 1);

        LocalDate beforeDate = before.toLocalDate();
        LocalDate afterDate = after.toLocalDate();

        Period between = Period.between(beforeDate, afterDate);
        int days = between.getDays();

        System.out.println("days = " + days);
    }

}
