package javaDateTime.dateTimeNew.localDateTime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GetLocalDateTime {
    @Test
    void testGetLocalDateTimeDefault() {
        //contoh mendapatkan localDateTime secara default
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //contoh set localDateTime dengan Integer dan String
        LocalDateTime localDateTimeWithInteger = LocalDateTime.of(2001, 07, 01, 14, 00);
        System.out.println(localDateTimeWithInteger);
        LocalDateTime localDateTimeWithString = LocalDateTime.parse("2001-07-01T14:00");
        System.out.println(localDateTimeWithString);
    }
    @Test
    void testGetLocalDateTimeDetail() {
        //contoh mendapatkan localDateTime secara detail
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
    }
}
