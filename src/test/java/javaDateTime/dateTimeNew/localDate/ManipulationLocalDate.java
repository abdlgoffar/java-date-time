package javaDateTime.dateTimeNew.localDate;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ManipulationLocalDate {
    @Test
    void testManipulationLocalDate() {
        LocalDate localDate = LocalDate.now();
        //contoh manipulasi localDate menambah tahun dan bulan
        LocalDate localDatePlusManipulation = localDate.plusYears(5).minusMonths(02);
        System.out.println(localDatePlusManipulation);
    }
}
