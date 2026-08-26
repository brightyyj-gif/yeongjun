package a0826.interfaceShop;

public class KakaoPay implements Payable {
    private int balance;

    public KakaoPay(int balance) {
        this.balance = balance;
    }

    @Override
    public String getMethodName() {
        // TODO Auto-generated method stu
        return "카카오페이";
    }

    @Override
    public boolean pay(int amount) {
        if(amount > balance) {
            System.out.println("잔액(한도) 부족");
            return false;
        }
        balance -= amount;
        System.out.println("카드 결제 완료: " + amount + "원");
        return true;
    }
        
    }

    
    
