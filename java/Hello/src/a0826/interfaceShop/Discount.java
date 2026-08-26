package a0826.interfaceShop;

public interface Discount { // 원가에 할인 적용
    double apply(int price); // 상품가격을 받아서 할인된 가격을 반환
    String getName();
}
