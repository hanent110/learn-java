package com.dtreesoft.grammer.date;

import java.time.LocalDateTime;

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
    }
}
