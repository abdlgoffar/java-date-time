package javaDateTime.dateTimeNew.localDateTime.convertLocalDateTime;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeToLocalTime {
    @Test
    void testLocalDateTimeToLocalTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        //contoh convert localDateTime ke localTime
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);
    }
}
