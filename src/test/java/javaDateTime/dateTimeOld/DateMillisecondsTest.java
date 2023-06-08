package javaDateTime.dateTimeOld;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class DateMillisecondsTest {
    @Test
    void testDateMilliseconds() {
        //contoh membuat date and time di java util Date
        Date dateNow = new Date(System.currentTimeMillis());
        System.out.println(dateNow);
        Date dateMyBirthYear = new Date(993920400000L);//date dengan parameter Long milliseconds
        System.out.println(dateMyBirthYear);
    }
}
