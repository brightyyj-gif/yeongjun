package a0812.exception;

//자바 예외
//프로그램 실행중 발생하는 오류
// 0 으로 나누기
// 없는 배열 인덱스 접근 
// 파일이 없는 경우
// 숫자가 아닌 문자를 숫자로 변환

public class Exception1 {
    //예외발생
    public static void main(String[] args) {
        int num = 10 / 0; //java.lang.ArithmeticException: / by zero - 다음줄에 있는   System.out.println() 실행되지 않는다.
        System.out.println("프로그램종료");
    }
}
