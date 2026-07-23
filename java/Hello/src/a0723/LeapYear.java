package a0723;

public class LeapYear {
    public static void main(String[] args) {
        // 복합 논리 연산을 사용한 윤년 조건식
        // 조건 1: (4로 나누어떨어지고) AND (100으로 나누어떨어지지 않음)
        // 조건 2: OR (400으로 나누어떨어짐)
        int year = 2026;
        
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if(isLeapYear) {
            System.out.println(year + "년은 윤년입니다. (2월이 29일까지 있어요)");
        }else {
            System.out.println(year + "년은 윤년이 아닙니다.(2월이 28일까지 있어요)");
        }
    }
}
