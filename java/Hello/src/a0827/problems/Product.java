package a0827.problems;

public class Product {
    private String name;
    private int price;
    private int stock;
    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "상품명: " + name + ", 가격: " + price +"원" + "재고: " + stock + "개";
    }
    
    int getTotalValue() {
        return price * stock;
    }

    boolean isAvailable() {
        if(stock > 0) {
            return true;
        }
        return false;
        
    }
    
}
