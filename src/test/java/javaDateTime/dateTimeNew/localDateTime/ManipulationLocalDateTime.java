package javaDateTime.dateTimeNew.localDateTime;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class ManipulationLocalDateTime {
    @Test
    void testManipulationLocalDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        //contoh memanipulasi menambah dan mengurangi localDateTime
        LocalDateTime localDateTime1 = localDateTime.plusYears(02).minusMonths(03).plusDays(30).minusHours(10).minusMinutes(50);
        System.out.println(localDateTime1);
    }
}
