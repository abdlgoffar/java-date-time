package javaDateTime.dateTimeNew.zoneId;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.util.Set;

public class GetZoneId {
    @Test
    void testGetZoneId() {
        //contoh mendapatkan time zone
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        ZoneId zoneIdWit = ZoneId.of("Asia/Jayapura");
        System.out.println(zoneIdWit);
        //contoh mendapatkan semua time zone default
        Set<String> selectAllDefaultZoneId = ZoneId.getAvailableZoneIds();
        selectAllDefaultZoneId.forEach(data -> System.out.println(data));
    }
}
