package javaDateTime.dateTimeOld;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneTest {
    @Test
    void testGetTimeZoneDefault() {
        //cara mendapatkan default time zone di system operasi PC
        TimeZone timeZoneDefault = TimeZone.getDefault();
        System.out.println(timeZoneDefault);
    }
    @Test
    void setTimeZone() {
        //contoh set time zone
        Calendar calendarWib = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jakarta"));
        Calendar calendarWit = Calendar.getInstance(TimeZone.getTimeZone("Asia/Jayapura"));
        System.out.println(calendarWib.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendarWit.get(Calendar.HOUR_OF_DAY));
    }
}
