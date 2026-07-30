package a0730.product1;

public class Product {
    private String name;
    private int price;
    private int quantity;
    private double discountRate; //할인율
    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discountRate = 0.0; //기본할인율 0%
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getDiscountRate() {
        return discountRate;
    }

    //할인율 설정 (유효성 검사)
    public void setDiscountRate(double discountRate) {
        if(discountRate < 0 || discountRate > 1) {
            System.out.println("할인율은 0.0 ~ 1.0 사이 여야합니다.");
            return;//
        }
        this.discountRate = discountRate;

    }
    public void printProductInfo() {
        System.out.println("==== 상품정보 ====");
        System.out.println("상품명: " + name);
        System.out.println("단가: " + String.format("%, d", price)+ "원");
        System.out.println("수량: " + quantity + "개");
        System.out.println("총금액: " + String.format("%, d", calcTotalPrice()));
        if(discountRate > 0) {
            System.out.println("할인율: " + (discountRate * 100)+ "%");
            System.out.println("할인금액: " + String.format("%, d,", calcDiscountAmount()));
            System.out.println("할인 후 금액: " + String.format("%, d,", calcFinalPrice()));
        }else { //할인율이 0인것
            System.out.println("할인 후 금액: " + String.format("%, d,", calcFinalPrice()));
        }
    }
    //최종금액
    private int calcFinalPrice() {
        return calcTotalPrice() - calcDiscountAmount();
    }//할인금액
    private  int calcDiscountAmount() {
        return (int)(calcTotalPrice() * discountRate);
    }
    //기본금액(총금액)
    private int calcTotalPrice() {
        return price * quantity; //수량 * 단가
    }
    
}
