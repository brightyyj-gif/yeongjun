package a0826.Exception;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try {
            System.out.println("=== 첫 번째 출금 시도 (5,000원) ===");
            account.withdraw(5000); // 성공

            System.out.println("\n=== 두 번쨰 출금 시도 (8,000원) ===");
            account.withdraw(8000); // 실패! 예외 발생함

            System.out.println("이 코드는 실행되지 않습니다."); // 예외 발생 시 건너뜀
        } catch (InsufficientBalanceException e) {
            // 우리가 만든 사용자 정의 예외를 잡아서 처리
            System.out.println("[예외 캐치 성공]" + e.getMessage());
        }
        System.out.println("\n=== 프로그램 정상 종료 ===");
    }
}
