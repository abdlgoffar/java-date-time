package javaDateTime.dateTimeNew.periode;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

public class GetPeriod {
    @Test
    void testGetPeriod() {
        //contoh membuat dan mendapatkan value dari periode
        Period period = Period.of(5, 12, 28);
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
    @Test
    void testCalculationPeriod() {
        //contoh menghitung periode usia
        Period period = Period.between(LocalDate.of(2001, 07, 01), LocalDate.now());
        System.out.println(period);
        System.out.println(period.getYears()+" year");
        System.out.println(period.getMonths()+" month");
        System.out.println(period.getDays()+" day");
    }
}
