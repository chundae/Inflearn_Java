package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {

    public static void main(String[] args) {

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String zoneId : availableZoneIds) {
            ZoneId zone = ZoneId.of(zoneId);
            System.out.println(zoneId+ " | " + zone.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId = " + zoneId);

        ZoneId seoul = ZoneId.of("Asia/Seoul");
        System.out.println("seoul = " + seoul);
    }
}
