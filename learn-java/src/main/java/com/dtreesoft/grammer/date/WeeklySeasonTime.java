package com.dtreesoft.grammer.date;

import java.sql.Timestamp;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class WeeklySeasonTime extends SeasonTime {

    private final int beginDayOfWeek;
    private final int beginHour;
    private final int endDayOfWeek;
    private final int endHour;

    private WeeklySeasonTime(int beginDayOfWeek, int beginHour, int endDayOfWeek, int endHour) {
        this.beginDayOfWeek = beginDayOfWeek;
        this.beginHour = beginHour;
        this.endDayOfWeek = endDayOfWeek;
        this.endHour = endHour;
    }

    public static WeeklySeasonTime createWeeklySeason(int beginDayOfWeek, int beginHour, int endDayOfWeek, int endHour) {
        if (beginDayOfWeek < 1 || beginDayOfWeek > 7) {
            // 1=월, 2=화, 3=수, 4=목, 5=금, 6=토, 7=일
            // 범위를 넘어가면 DateTimeException 이 발생한다.
            // narotodo: 에러 로그 추가.
            return null;
        }

        if (beginHour < 0 || beginHour > 23) {
            // narotodo: 에러 로그 추가.
            return null;
        }

        if (endDayOfWeek < 1 || endDayOfWeek > 7) {
            // narotodo: 에러 로그 추가.
            return null;
        }

        if (endHour < 0 || endHour > 23) {
            // narotodo: 에러 로그 추가.
            return null;
        }

        return new WeeklySeasonTime(beginDayOfWeek, beginHour, endDayOfWeek, endHour);
    }

    /**
     *   지금 시각 기준 시즌 시작 시간을 얻어온다.
     */
    public LocalDateTime getSeasonBeginTimeAtNow() {
        return getSeasonBeginTime(getEpochMillisNow());
    }

    /**
     *  nowEpochMillis 시간이 시즌 종료 기간이면 이전 시즌 시작 시간을 얻어온다.
     *  nowEpochMillis 시간이 시즌 중인 기간이면 현재 시즌 시작 시간을 얻어온다.
     */
    public LocalDateTime getSeasonBeginTime(long nowEpochMillis) {
        LocalDateTime beginTime;
        LocalDateTime now = convertEpochMillisToLocalDateTime(nowEpochMillis);

        if (now.getDayOfWeek() == getDayOfWeekFromInt(beginDayOfWeek)) {
            if (now.getHour() < beginHour) {
                // withHour 가능 범위 0-23
                beginTime = now.with(TemporalAdjusters.previous(getDayOfWeekFromInt(beginDayOfWeek)))
                               .withHour(beginHour).withMinute(0).withSecond(0).withNano(0);
            } else {
                beginTime = now.withHour(beginHour).withMinute(0).withSecond(0).withNano(0);
            }
        } else {
            beginTime = now.with(TemporalAdjusters.previous(getDayOfWeekFromInt(beginDayOfWeek)))
                           .withHour(beginHour).withMinute(0).withSecond(0).withNano(0);
        }

        return beginTime;
    }

    /**
     *  지금 시각 기준 시즌 종료 시간을 얻어온다.
     */
    public LocalDateTime getSeasonEndTimeAtNow() {
        return getSeasonEndTime(getEpochMillisNow());
    }

    /**
     *  nowEpochMillis 시간이 시즌 종료 기간이면 이전 시즌 종료 시간을 얻어온다.
     *  nowEpochMillis 시간이 시즌 중인 기간이면 현재 시즌 종료 시간을 얻어온다.
     */
    public LocalDateTime getSeasonEndTime(long nowEpochMillis) {
        LocalDateTime endTime;
        LocalDateTime seasonBeginTime = getSeasonBeginTime(nowEpochMillis);

        endTime = seasonBeginTime.with(TemporalAdjusters.next(getDayOfWeekFromInt(endDayOfWeek)))
                                 .withHour(endHour);

        return endTime;
    }

    private DayOfWeek getDayOfWeekFromInt(int pivotDayOfWeek) {
        // 1=월, 2=화, 3=수, 4=목, 5=금, 6=토, 7=일
        // 범위를 넘어가면 DateTimeException 이 발생한다.
        return DayOfWeek.of(pivotDayOfWeek);
    }

}
