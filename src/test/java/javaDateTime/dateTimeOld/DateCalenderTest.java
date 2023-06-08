package javaDateTime.dateTimeOld;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class DateCalenderTest {

    private Calendar calendar;
    @BeforeEach
    void constructCalender() {
        this.calendar = Calendar.getInstance();
    }

    @Test
    void testSetCalender() {
        //contoh set calender
        this.calendar.set(Calendar.YEAR, 2001);
        this.calendar.set(Calendar.MONTH, Calendar.JULY);
        this.calendar.set(Calendar.DAY_OF_MONTH, 01);
        //convert calendar to Date
        Date date = calendar.getTime();
        System.out.println(date);
    }
    @Test
    void testGetCalender() {
        //contoh get calender
        System.out.println(this.calendar.get(Calendar.YEAR));
        System.out.println(this.calendar.get(Calendar.MONTH));
        System.out.println(this.calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println(this.calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(this.calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(this.calendar.get(Calendar.MINUTE));
        System.out.println(this.calendar.get(Calendar.SECOND));
    }
}
