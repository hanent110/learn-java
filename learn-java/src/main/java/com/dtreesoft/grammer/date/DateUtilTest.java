package com.dtreesoft.grammer.date;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DateUtilTest {
    public static void main(String[] args) {
        DateUtilTest dateUtilTest = new DateUtilTest();
        dateUtilTest.weeklySeasonTest();
    }

    private void weeklySeasonTest() {
        tuesdayTest();

        mondayTest();
    }

    private void tuesdayTest() {
        // for test time;
        // 1624395660000L : 2021년 6월 23일 수요일 오전 6:01:00
        // 1624481940000L : 2021년 6월 24일 목요일 오전 5:59:00
        // 1624482000000L : 2021년 6월 24일 목요일 오전 6:00:00
        // 1624482060000L : 2021년 6월 24일 목요일 오전 6:01:00
        List<Long> testTimes = new ArrayList<>(Arrays.asList(1624395660000L, 1624481940000L, 1624482000000L, 1624482060000L));

        System.out.println("목요일 6시 ~ 목요일 0시 시즌");
        // 목요일 6시 ~ 목요일 0시 시즌
        WeeklySeasonTime weeklySeasonTime = WeeklySeasonTime.createWeeklySeason(4, 6, 4, 0);

        for (Long testTime : testTimes) {
            LocalDateTime seasonBeginTime = weeklySeasonTime.getSeasonBeginTime(testTime);
            LocalDateTime seasonEndTime = weeklySeasonTime.getSeasonEndTime(testTime);
            System.out.println("now = " + new Timestamp(testTime).toLocalDateTime() + ", seasonBeginTime = " + seasonBeginTime + ", seasonEndTime = " + seasonEndTime);
        }
    }

    private void mondayTest() {
        // for test time;
        // 1624201199000L : 2021년 6월 20일 일요일 오후 11:59:59
        // 1624212000000L : 2021년 6월 21일 월요일 오전 3:00:00
        // 1624222740000L : 2021년 6월 21일 월요일 오전 5:59:00
        // 1624222800000L : 2021년 6월 21일 월요일 오전 6:00:00
        // 1624222860000L : 2021년 6월 24일 월요일 오전 6:01:00
        List<Long> testTimes = new ArrayList<>(Arrays.asList(1624201199000L, 1624212000000L, 1624222740000L, 1624222800000L, 1624222860000L));

        System.out.println("월요일 6시 ~ 월요일 0시 시즌");
        // 목요일 6시 ~ 목요일 0시 시즌
        WeeklySeasonTime weeklySeasonTime = WeeklySeasonTime.createWeeklySeason(1, 6, 1, 0);

        for (Long testTime : testTimes) {
            LocalDateTime seasonBeginTime = weeklySeasonTime.getSeasonBeginTime(testTime);
            LocalDateTime seasonEndTime = weeklySeasonTime.getSeasonEndTime(testTime);
            System.out.println("now = " + new Timestamp(testTime).toLocalDateTime() + ", seasonBeginTime = " + seasonBeginTime + ", seasonEndTime = " + seasonEndTime);
        }
    }
}
