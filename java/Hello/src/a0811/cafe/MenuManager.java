package a0811.cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager {

    private ArrayList<Menu> menus;
    private ArrayList<Menu> orderList;

    public MenuManager() {
        menus = new ArrayList<>();
        orderList = new ArrayList<>();
        menus.add(new Menu("Americano", 4500, "Coffee", "M001"));
        menus.add(new Menu("Latte", 5000, "Coffee", "M002"));
        menus.add(new Menu("Cheesecake", 6500, "Dessert", "M003"));
    }

    public void showAvailableMenus() {
        System.out.println("주문 가능한 메뉴");
        for (Menu menu : menus) {
            if (menu.isAvailable()) {
                System.out.println(menu);
            }
        }
    }

    public boolean order(String name) {
        for (Menu menu : menus) {
            if (menu.getName().equalsIgnoreCase(name) && menu.isAvailable()) {
                menu.order();
                orderList.add(menu);
                return true;
            }
        }
        return false;
    }

    public void order() {
        for (Menu menu : orderList) {
            System.out.println(menu);
        }
    }

    public void addMenu(String name, int price, String category, String menuId) {
        menus.add(new Menu(name, price, category, menuId));
    }

    public void deleteMenu(String name) {
        boolean result = false;
        for (Menu menu : menus) {
            if (menu.getName().equalsIgnoreCase(name)) {
                if (menu.isAvailable()) {
                    menus.remove(menu);
                    result = true;
                }
                break;
            }
        }
        System.out.println(result ? "삭제됨" : "삭제안됨");
    }

    public void updateMenu(String name) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        for (Menu menu : menus) {
            if (menu.getName().equalsIgnoreCase(name)) {
                System.out.print("수정 항목\n1. 이름\t2. 가격\t3. 카테고리\t4. 코드\n >>");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("수정할 이름: ");
                        menu.setName(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("수정할 가격: ");
                        menu.setPrice(sc.nextInt());
                        sc.nextLine();
                        break;
                    case 3:
                        System.out.print("수정할 카테고리: ");
                        menu.setCategory(sc.nextLine());
                        break;
                    case 4:
                        System.out.print("수정할 코드: ");
                        menu.setMenuId(sc.nextLine());
                        break;
                    default:
                        System.out.println("1~4번 중에 입력하세요");
                        return;
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("찾는 메뉴가 없어서 수정할 수 없습니다.");
        }
    }

    public void showMenu(String name) {
        for (Menu menu : menus) {
            if (menu.getName().equalsIgnoreCase(name)) {
                System.out.println(menu);
            }
        }
    }
}
