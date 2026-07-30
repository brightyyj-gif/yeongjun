package a0730.product1;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product(null, 0, 0);
        Product product2 = new Product(null, 0, 0);
        Product product3 = new Product(null, 0, 0);



        product1.setDiscountRate(0.1); //10
        product2.setDiscountRate(0.15);

        System.out.println();
        //상품 정보 출력
        product1.printProductInfo();
        System.out.println();

        product2.printProductInfo();
        System.out.println();

        product3.printProductInfo();
        System.out.println();
    }
}
