package a0827.calender;

import java.util.Calendar; // 날짜와 시간을 다루기 위한 클래스

public class Calender1 {
    public static void main(String[] args) {
        Calendar calender = Calendar.getInstance();
        int year = calender.get(Calendar.YEAR);
        int month = calender.get(Calendar.MONTH) + 1;
        int day = calender.get(Calendar.DAY_OF_MONTH);
        int hour = calender.get(Calendar.HOUR_OF_DAY);
        int minute = calender.get(Calendar.MINUTE);
        int second = calender.get(Calendar.SECOND);
        System.out.println("현재시간 : " + year + "-" + month + "-" + day + "-" + hour + "-" + minute + "-" + second);
    }
}
