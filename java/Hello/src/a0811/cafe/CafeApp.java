package a0811.cafe;

import java.util.Scanner;

public class CafeApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuManager manager = new MenuManager();
        boolean flag = true;

        while (flag) {
            System.out.println("\n 카페 메뉴 주문 시스템");
            System.out.println("1. 주문 가능한 메뉴 보기");
            System.out.println("2. 메뉴 주문하기");
            System.out.println("3. 주문한 메뉴 보기");
            System.out.println("4. 메뉴 추가하기");
            System.out.println("5. 메뉴 삭제하기");
            System.out.println("6. 메뉴 정보 수정하기");
            System.out.println("7. 메뉴 내용 보기");
            System.out.println("8. 종료");
            System.out.print("원하는 작업을 선택하세요 >>");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    manager.showAvailableMenus();
                    break;
                case 2:
                    System.out.print("주문할 메뉴 이름: ");
                    if (manager.order(sc.nextLine())) {
                        System.out.println("주문이 완료되었습니다.");
                    } else {
                        System.out.println("메뉴가 없거나 품절입니다.");
                    }
                    break;
                case 3:
                    System.out.println("주문한 메뉴 목록");
                    manager.order();
                    break;
                case 4:
                    System.out.print("메뉴 이름: ");
                    String name = sc.nextLine();
                    System.out.print("가격: ");
                    int price = sc.nextInt();
                    sc.nextLine();
                    System.out.print("카테고리: ");
                    String category = sc.nextLine();
                    System.out.print("메뉴 코드: ");
                    String menuId = sc.nextLine();
                    manager.addMenu(name, price, category, menuId);
                    System.out.println("메뉴 추가 완료");
                    break;
                case 5:
                    System.out.print("삭제할 메뉴 이름: ");
                    manager.deleteMenu(sc.nextLine());
                    break;
                case 6:
                    System.out.print("수정할 메뉴 이름: ");
                    manager.updateMenu(sc.nextLine());
                    break;
                case 7:
                    System.out.print("조회할 메뉴 이름: ");
                    manager.showMenu(sc.nextLine());
                    break;
                case 8:
                    System.out.println("프로그램을 종료합니다.");
                    flag = false;
                    break;
                default:
                    System.out.println("1~8번 중에 입력하세요.");
            }
        }
        sc.close();
    }
}
