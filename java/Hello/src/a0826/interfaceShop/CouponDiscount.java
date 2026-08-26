package a0826.interfaceShop;

public class CouponDiscount implements Discount {

    private int couponAmount;

    public CouponDiscount(int couponAmount) {
        this.couponAmount = couponAmount;
    }

    @Override
    public double apply(int price) {
        int result = price - couponAmount;
        return result < 0 ? 0 :result; // 0보다 작으면 0 저장 아니면 result 반환
    }

    @Override
    public String getName() {
        return "쿠폰할인(" + couponAmount + "원)";
    }
    
}
