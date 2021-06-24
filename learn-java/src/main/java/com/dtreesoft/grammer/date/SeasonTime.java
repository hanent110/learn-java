package com.dtreesoft.grammer.date;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public abstract class SeasonTime {

    public static long getEpochMillis(LocalDateTime localDateTime) {
        return Timestamp.valueOf(localDateTime).getTime();
    }

    public static long getEpochMillisNow() {
        return Timestamp.valueOf(LocalDateTime.now()).getTime();
    }

    public static LocalDateTime convertEpochMillisToLocalDateTime(long epochMillis) {
        return new Timestamp(epochMillis).toLocalDateTime();
    }

}