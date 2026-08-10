package a0810.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMenu3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Integer> menu = new HashMap<>();

        //커피메뉴 추가
        menu.put("아메리카노", 4000);
        menu.put("카페라떼", 4500);
        menu.put("카푸치노", 5000);
        // menu.put("에스프레소", 3500);
        // menu.put("바닐라라떼", 5500);
        // menu.put("카라멜마키아토", 5000);

        System.out.println("=== 초기 커피 메뉴 ===");
        for(Map.Entry<String,Integer> entry : menu.entrySet()){
            // System.out.println(entry.getKey() + " : " + entry.getValue() + "원");
            String coffee = entry.getKey();
            int price = entry.getValue();
            System.out.println(coffee + ": " + price + "원");
        }
        //새 메뉴 추가
        System.out.print("\n추가할 메뉴 이름:");
        String newMenu = scanner.nextLine();
        System.out.println("가격을 정하세요 :");
        int newPrice = scanner.nextInt();
        scanner.nextLine();//버퍼지우기
        menu.put(newMenu, newPrice);
        System.out.println(newMenu + "가 추가되었습니다.");
        System.out.println("===메뉴===");
        for(Map.Entry<String,Integer> entry : menu.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue() + "원");
        }
        

            //기존과정 수정
            System.out.print("\n수정할 메뉴 이름 :");
            String updateMenu = scanner.nextLine();
            if(menu.containsKey(updateMenu)){
                System.out.println("새 가격 :");
                int updatePrice = scanner.nextInt();
                scanner.nextLine();
                menu.put(updateMenu, updatePrice);
                System.out.println(updateMenu + "의 가격이 " + updatePrice + "원으로 수정");
            }else {
                System.out.println("해당 메뉴가 없습니다.");
            }
            System.out.println("=== 초기 커피 메뉴 ===");
        for(Map.Entry<String,Integer> entry : menu.entrySet()){
         System.out.println(entry.getKey() + " : " + entry.getValue() + "원");
    }
    
}
}

