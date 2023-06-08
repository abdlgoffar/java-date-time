package javaDateTime.dateTimeNew.localDateTimeZone;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GetLocalDateTimeZone {
    //di localDateTimeZone perbedaannya dari localDate localTime dan localDateTime adalah bisa menambahkan time zone pada waktunya
    @Test
    void testGetLocalDateTimeZoneDefault() {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        //contoh zonedDateTime dengan Integer dan String
        ZonedDateTime zonedDateTimeWithInteger = ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault());
        System.out.println(zonedDateTimeWithInteger);
    }
}
