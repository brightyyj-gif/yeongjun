package a0804.payment;

public class NaverPay implements Payment{

    @Override
    public void pay(int amount) {
        System.out.println("NaverPay: 네이버페이로 " + amount + "원을 결제합니다.");
    }
}
