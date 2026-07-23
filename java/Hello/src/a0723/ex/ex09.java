package a0723.ex;

public class ex09 {
    public static void main(String[] args) {
        int kor = 80;
        int eng = 95;
        int math = 100;

        //int avg = (kor + eng +math) / 3;
        double avg = (kor + eng + math) / 3.0;
        System.out.println("평균 : " + avg);
        System.out.printf("평균 : %.1f%n" , avg);
        // %f = 실수출력
        // %.1f - 소수점 첫째자리 까지 출력
        // %n : 줄바꿈
    }
    
}
