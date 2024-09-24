package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantTimeMain {

    public static void main(String[] args) {

        Instant now = Instant.now(); //UTC 기준
        System.out.println("now = " + now);

        //zoneTime -> Instant
        ZonedDateTime ztd = ZonedDateTime.now();
        Instant from = Instant.from(ztd);
        System.out.println("from = " + from);

        Instant epochSecond = Instant.ofEpochSecond(0);
        System.out.println("epochSecond = " + epochSecond);

        //계산
        Instant later = epochSecond.plusSeconds(3600);
        System.out.println("later = " + later);


        //조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);

    }
}
