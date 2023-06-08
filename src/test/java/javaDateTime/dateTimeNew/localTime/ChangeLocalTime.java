package javaDateTime.dateTimeNew.localTime;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class ChangeLocalTime {
    @Test
    void testChangeLocalTime() {
        LocalTime localTimeDefault = LocalTime.now();
        System.out.println(localTimeDefault);
        //jika mengubah local time dengan method with maka return valuenya adalah object time baru
        LocalTime localTimeChange = localTimeDefault.withHour(06).withMinute(00).withSecond(59);
        System.out.println(localTimeChange);

    }
}
