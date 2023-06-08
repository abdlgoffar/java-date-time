package javaDateTime.dateTimeNew.localTime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

public class GetLocalTime {
    @Test
    void testGetLocalTimeDefault() {
        //contoh mendapatkan waktu time sekarang
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        //contoh set waktu dengan Integer dan String
        LocalTime localTimeWithInteger = LocalTime.of(12, 00);
        System.out.println(localTimeWithInteger);
        LocalTime localTimeWithString = LocalTime.parse("11:00");
        System.out.println(localTimeWithString);
    }
    @Test
    void testGetLocalTimeDetail() {
        //contoh mendapatkan local time secara detail
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
    }
}
