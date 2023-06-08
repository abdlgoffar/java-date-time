package javaDateTime.dateTimeNew.yearMonthDay;

import org.junit.jupiter.api.Test;

import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class GetYearMonthDay {
    @Test
    void testGetYearMonthDayDefault() {
        //contoh membuat tahun secara default
        Year year = Year.now();
        System.out.println(year);
        Year yearWithInteger = Year.of(2001);
        System.out.println(yearWithInteger);
        Year yearWithString = Year.parse("2001");
        System.out.println(yearWithString);

        //contoh membuat tahun-bulan secara default
        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth);
        YearMonth yearMonthWithInteger = YearMonth.of(2001, Month.JULY);
        System.out.println(yearMonthWithInteger);
        YearMonth yearMonthWithString = YearMonth.parse("2001-07");
        System.out.println(yearMonthWithString);

        //contoh membuat bulan-hari secara default
        MonthDay monthDay = MonthDay.now();
        System.out.println(monthDay);
        MonthDay monthDayWithInteger = MonthDay.of(Month.JULY, 01);
        System.out.println(monthDayWithInteger);
        MonthDay monthDayWithString = MonthDay.parse("--07-01");
        System.out.println(monthDayWithString);
    }
}
