package a0804.payment;

public class CreditCard implements Payment{

    @Override
    public void pay(int amount) {
        System.out.println("CreditCard: 신용카드로 " + amount + "원을 결제합니다.");
    }
    
}
