package a0811.cafe;

public class Menu {

    private String name;
    private int price;
    private String category;
    private String menuId;
    private boolean available;

    public Menu() {
    }

    public Menu(String name, int price, String category, String menuId) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.menuId = menuId;
        this.available = true;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void order() {
        this.available = false;
    }

    @Override
    public String toString() {
        return "메뉴 : " + name + ", 가격=" + price + "원, 카테고리=" + category + ", 코드=" + menuId
                + (available ? "주문가능" : "품절");
    }
}
