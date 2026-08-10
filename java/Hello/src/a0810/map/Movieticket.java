package a0810.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Movieticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Integer> menu = new HashMap<>();

        menu.put("어벤져스", 15000);
        menu.put("기생충", 12000);
        menu.put("범죄도시", 13000);
        menu.put("인터스텔라", 14000);
        menu.put("타이타닉", 12000);
        menu.put("겨울왕국", 11000);
        menu.put("오펜하이머", 15000);

        //주문 내역 저장
        HashMap<String,Integer> order = new HashMap<>();

        while(true) {
            System.out.println("=== 영화 메뉴 ===");
            for(Map.Entry<String,Integer> entry : menu.entrySet()){
                System.out.println(entry.getKey() + " : " + entry.getValue() + "원");
            }
            System.out.println("\n주문할 영화를 입력하세요 (종료: '종료'): ");
            String movieName = scanner.nextLine();
            if(movieName.equals("종료")){
                break;
            }
            if(!menu.containsKey(movieName)){
                System.out.println("해당 영화가 없습니다. 다시 입력해 주세욧");
                continue;
            }

            System.out.print("수량을 입력하세요");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            if(quantity <= 0) {
                System.out.println("수량은 1개이상이어야 합니다");
                continue;
            }
            if(order.containsKey(movieName)){
                order.put(movieName, order.get(movieName) + quantity);
            }else {
                order.put(movieName, quantity);
            }
            int price = menu.get(movieName);
            System.out.println(movieName + quantity + "개가 예매되었습니다. (금액은 " + (price * quantity) + "입니다)");

            
        }

        int totalAmount = 0;
        int totalQuantity = 0;
        for(Map.Entry<String, Integer> entry : order.entrySet()) {
            String movieName = entry.getKey();
            int quantity = entry.getValue();
            int price = menu.get(movieName);
            int subtotal = price * quantity;
            System.out.println(movieName + " X " + quantity + " = " + subtotal);
            totalAmount += subtotal;
        }
        System.out.println("\n총 금액 : " + totalAmount + "원");
        scanner.close();

    }
}
