package a0804.payment;

public class KakaoPay implements Payment{

    @Override
    public void pay(int amount) {
        System.out.println("KakaoPay: 카카오페이로 " + amount + "원을 결제합니다.");
    }
    
}
