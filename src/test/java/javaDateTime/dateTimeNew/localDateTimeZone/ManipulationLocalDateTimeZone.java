package javaDateTime.dateTimeNew.localDateTimeZone;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ManipulationLocalDateTimeZone {
    @Test
    void setTimeZoneOnly() {
        //contoh hanya mengubah timeZone nya saja tanpa dengan tanggal dan jamnya
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        ZonedDateTime zonedDateTimeSetTimeZoneOnly = zonedDateTime.withZoneSameLocal(ZoneId.of("Asia/Jayapura"));
        System.out.println(zonedDateTimeSetTimeZoneOnly);
    }
    @Test
    void setTimeZoneAndDateTime() {
        //contoh mengubah timeZone tanggal dan jamnya
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeAndSetDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Jayapura"));
        System.out.println(zonedDateTimeAndSetDateTime);
    }
}
