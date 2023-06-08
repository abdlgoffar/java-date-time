package javaDateTime.dateTimeNew.localDate;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class GetLocalDate {
    @Test
    void testGetLocalDateDefault() {
        //contoh mendapatkan waktu tanggal sekarang
        LocalDate localDateNow = LocalDate.now();
        System.out.println(localDateNow);
        //contoh set tanggal dengan integer dan string
        LocalDate localDateSetWithInteger = LocalDate.of(2001, 07, 01);
        System.out.println(localDateSetWithInteger);
        LocalDate localDateSetWithString = LocalDate.parse("2001-07-01");
        System.out.println(localDateSetWithString);
    }
    @Test
    void testGetLocalDateDetail() {
        //contoh mengambil local date secara detail
        LocalDate localDateDetail = LocalDate.now();
        System.out.println(localDateDetail.getYear());
        System.out.println(localDateDetail.getMonth());
        System.out.println(localDateDetail.getDayOfMonth());
    }
}
