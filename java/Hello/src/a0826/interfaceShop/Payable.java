package a0826.interfaceShop;

// 할인된 금액 결제
public interface Payable {
    boolean pay(int amount);
    String getMethodName();
}
