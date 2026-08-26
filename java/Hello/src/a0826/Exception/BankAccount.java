package a0826.Exception;

public class BankAccount {
    private int balance = 10000; // 초기 잔고 만원

    public int getBalance() {
        return balance;
    }


    // 출금 메서드
    public void withdraw(int amount) throws InsufficientBalanceException{ //예외발생할 수 있으니 호출하는 쪽에서 처리
        if(balance < amount) { // 잔고가 부족하면 사용자 정의 예외를 강제로 발생시킴 (throw)
            throw new InsufficientBalanceException("잔액부족! 현재 잔고는 " + balance + "원인데 "+ amount + "원을 출금하려고 함");
            


        }
        balance -= amount;
        System.out.println(amount + "원이 정상 출금! 남은잔고 : " + balance + "원 입니다.");
    }
}
