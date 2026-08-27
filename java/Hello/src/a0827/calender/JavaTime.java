package a0827.calender;

import java.time.LocalDate;
import java.time.LocalTime;

public class JavaTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today); // 2026-08-27
        // 날짜의 년, 월, 일 가져오기
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfMonth());

        LocalTime now = LocalTime.now();
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());

        // 특정 날짜 만들기
        LocalDate date = LocalDate.of(2026, 9, 27);
        System.out.println(date);
    }
}
