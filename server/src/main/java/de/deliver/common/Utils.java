package de.deliver.common;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Utils {
    public static ZonedDateTime stringToDatetime(String dateTime) {
        LocalDateTime localDatetime = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        ZonedDateTime zonedDatetime = ZonedDateTime.of(localDatetime, ZoneOffset.systemDefault());
        return zonedDatetime;
    }
}
