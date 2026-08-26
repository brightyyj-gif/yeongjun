package a0826.interfaceShop;

public class CardPay implements Payable {
    private int limit;

    public CardPay(int limit) {
        this.limit = limit;
    }

    @Override
    public String getMethodName() {
        // TODO Auto-generated method stub
        return "카드";
    }

    @Override
    public boolean pay(int amount) {
        if(amount > limit) {
            System.out.println("잔액(한도) 부족");
            return false;
        }
        limit -= amount;
        System.out.println("카드 결제 완료: " + amount + "원");
        return true;
    }
    
    
}
