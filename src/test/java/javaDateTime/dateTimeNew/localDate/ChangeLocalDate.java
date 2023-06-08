package javaDateTime.dateTimeNew.localDate;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ChangeLocalDate {
    @Test
    void testChangeLocalDate() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        //jika mengubah local date dengan method with maka return valuenya adalah object localDate baru
        LocalDate localDateYear = localDate.withYear(2001).withMonth(07).withDayOfMonth(01);
        System.out.println(localDateYear);
    }
}
