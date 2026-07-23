package a0723.ex;

public class ex13 {
    public static void main(String[] args) {
        int price = 100000;
        int discount = price * 20 / 100;
        int result = price - discount;
        System.out.println("할인금액 : " + discount);
        System.out.println("최종금액 : " + result);
    }
    
}
