package a0804.payment;

public class Main {
    public static void main(String[] args) {
        CreditCard cd = new CreditCard();
        KakaoPay kp = new KakaoPay();
        NaverPay Np = new NaverPay();

        Payment[] payments = {cd, kp, Np};
        for(Payment payment : payments) {
            payment.pay(50000);
        }
    }
}
