package javaDateTime.dateTimeNew.localDateTime.convertLocalDateTime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeToLocalDate {
    @Test
    void testLocalDateTimeToLocalDate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        //contoh convert localDateTime ke localDate
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
    }
}
