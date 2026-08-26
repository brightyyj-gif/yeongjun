package a0826.Exception;

// 1. 사용자가 정의 예외 클래스 만들기
public class InsufficientBalanceException extends RuntimeException{

    // 기본 생성자
    public InsufficientBalanceException() {
    }
    // 상세페이지를 부모(RuntimeException)에게 전달하는 생성자

    public InsufficientBalanceException(String message) {
        super(message);
    }
    
    
    
}
