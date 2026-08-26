package a0826.interfaceShop;

public class MemberDiscount implements Discount {

    @Override
    public double apply(int price) {
        // TODO Auto-generated method stub
        return (price * 0.9);
    }

    @Override
    public String getName() {
        
        return "회원할인";
    }
    
}
