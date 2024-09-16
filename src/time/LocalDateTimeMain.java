package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {

        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10,1);
        System.out.println("현재시간 : " + nowDt);
        System.out.println("지정시간 : " + ofDt);

        //날짜와 시간을 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        //날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        //계산(불변) -> 2016/8/16 8:10:001
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("ofDtPlus+1000day = " + ofDtPlus);

        LocalDateTime ofDtPlus1year = ofDt.plusYears(1);
        System.out.println("ofDtPlus1year = " + ofDtPlus1year);

        LocalDateTime ofDtMinusDay = ofDt.minusDays(500);
        System.out.println("ofDtMinusDay = " + ofDtMinusDay);

        //비교
        System.out.println("현재 날짜시간이 지정 날짜 시간보다 이전인가? : " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜 시간보다 이후인가? : " + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜시간과 지정날짜 시간과 같은가? : " + nowDt.isEqual(ofDt));
    }
}
