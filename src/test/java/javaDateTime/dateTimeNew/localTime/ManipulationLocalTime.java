package javaDateTime.dateTimeNew.localTime;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class ManipulationLocalTime {
    @Test
    void testManipulationLocalTime() {
        //contoh manipulasi menambah dan mengurangi waktu
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime localTime1 = localTime.plusHours(03).minusMinutes(30).plusSeconds(50);
        System.out.println(localTime1);
    }
}
