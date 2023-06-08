package javaDateTime.dateTimeNew.localDateTime.convertLocalDateTime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateToLocalDateTime {
    @Test
    void testLocalDateToLocalDateTime() {
        LocalDate localDate = LocalDate.now();
        //contoh convert local date ke local date time
        LocalDateTime localDateTime = localDate.atTime(12, 00, 59);
        System.out.println(localDateTime);
    }
}
