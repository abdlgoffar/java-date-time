package javaDateTime.dateTimeNew.localDateTime.convertLocalDateTime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeToLocalDateTime {
    @Test
    void testLocalTimeToLocalDateTime() {
        LocalTime localTime = LocalTime.now();
        //contoh convert localTime ke LocalDateTime
        LocalDateTime localDateTime = localTime.atDate(LocalDate.of(2001, 7, 01));
        System.out.println(localDateTime);
    }
}
