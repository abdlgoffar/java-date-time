package javaDateTime.dateTimeNew.clock;

import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class BestPracticeDateTimeJava {
    @Test
    void testBestPracticeDateTimeJava() {
        //ini adalah contoh best practice membuat date time di java languange
        Clock clockJakarta = Clock.system(ZoneId.of("Asia/Jakarta"));
        LocalDate localDate = LocalDate.now(clockJakarta);
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now(clockJakarta);
        System.out.println(localTime);
    }
}
