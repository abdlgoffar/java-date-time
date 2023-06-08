package javaDateTime.dateTimeNew.duration;

import org.junit.jupiter.api.Test;

import java.time.Duration;

public class GetDuration {
    @Test
    void testGetDuration() {
        //contoh membuat durasi waktu
        Duration durationHours = Duration.ofHours(3);//durasi jam
        Duration durationMinutes = Duration.ofMinutes(50);//durasi menit
    }
    @Test
    void testCalculationDuration() {
        //contoh perhitungan durasi
        Duration duration = Duration.ofHours(1);
        //contoh chek 1 jam berapa menit
        Long chek1HoursHowManyMinutes = duration.toMinutes();
        System.out.println(chek1HoursHowManyMinutes);
    }
}
