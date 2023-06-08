package javaDateTime.dateTimeNew.clock;

import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.ZoneId;

public class GetClock {
    @Test
    void testGetClockTimeZone() {
        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));
        System.out.println(clock);
    }
}
