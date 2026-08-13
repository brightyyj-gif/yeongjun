package a0812.exception;

//자바 예외
//프로그램 실행중 발생하는 오류
// 0 으로 나누기
// 없는 배열 인덱스 접근 
// 파일이 없는 경우
// 숫자가 아닌 문자를 숫자로 변환

public class Exception2 {
    //예외발생
    public static void main(String[] args) {
        try{
            int num = 10 / 0;
        }catch(ArithmeticException e){
           
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("프로그램 계속 실행");
    }
}
