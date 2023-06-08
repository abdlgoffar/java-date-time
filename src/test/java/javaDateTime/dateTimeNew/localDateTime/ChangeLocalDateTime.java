package javaDateTime.dateTimeNew.localDateTime;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class ChangeLocalDateTime {
    @Test
    void testChangeLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //jika mengubah local date time dengan method with maka return valuenya adalah object local date time baru
        LocalDateTime localDateTime1 = localDateTime.withYear(2001).withMonth(07).withDayOfMonth(01).withHour(14).withMinute(00);
        System.out.println(localDateTime1);
    }
}
