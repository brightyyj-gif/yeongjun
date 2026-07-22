package a0721;

public class Var4 {
    public static void main(String[] args) {
        //정수형
         int age = 25;
         age = 26; //변수 값 변경 가능
        long population = 7800000000L;
           // 실수형
        double height = 175.5;
        float weight = 70.5f;
        
        // 문자형
        char grade = 'A';
        
        // 논리형
        boolean isStudent = true;

        //참조자료형
        String name = "홍길동";

        //상수
        final double PI = 3.14159;
        final int MAX_SCORE = 100;

        //상수는 변경 불가능

        //출력
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height + "cm");
        System.out.println("학생 여부: " + isStudent);
        System.out.println("원주율: " + PI);
        System.out.println(MAX_SCORE);
    }
    
}
