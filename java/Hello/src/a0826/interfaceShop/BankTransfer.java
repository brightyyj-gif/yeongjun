package a0826.interfaceShop;

public class BankTransfer implements Payable{

    @Override
    public String getMethodName() {
        
        return "계좌이체";
    }

    @Override
    public boolean pay(int amount) {
        System.out.println("계좌이체 완료: " + amount + "원");
        return true;
    }
    
}
