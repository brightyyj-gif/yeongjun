package a0820.coffee;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * CoffeeService
 */
public class CoffeeService {

    private boolean reOrder = false; //재주문
    private int orderNum = 1; //주문번호 초기화
    Map<String,Integer> orderList;

    public CoffeeService(){
        orderList = new LinkedHashMap<>(); // 입력순서 저장
    }
    Coffee coffee = Coffee.getInstance();
    Customer customer;

    Thread t = new Thread(); // 스레드

    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("\n 어서오세요 더조은 커피숍입니다.");
        customer = new Customer(orderNum);
        coffee.getMenu(); 
        order();

        totalOrder(customer);
        try{
            System.out.println("기다려 주시면 주문하신 음료가 나옵니다.");
            t.sleep(2000);
            //2초 후에 다음문장이 실행
            end();
        } catch(Exception e){
            e.printStackTrace();
        }

    }

    

    

    private void end() {
        int s =1;
         StringBuffer message = new StringBuffer();
        message.append("\n\n ")
                .append("+----------------------------------------------------+\n ")
                .append("|                                                    | \n ")
                .append("|           " + customer.getOrderName() + " 님 주문하신 음료 나왔습니다         | " + "\n");
        System.out.print(message);
        for (Map.Entry<String, Integer> order : customer.getCoffeeOrder().entrySet()) {
            System.out.printf(" | [%d] %-20s : %2d잔  %7s |\n", s, order.getKey(), order.getValue(), "");
            s++;
        }
        System.out.println(" |                                                    |");
        System.out.println(" +----------------------------------------------------+");
    }
    
    private void totalOrder(Customer customer) {
        int s = 1;
        int totalMoney = 0;
        int coffeePrice = 0;
        DecimalFormat f = new DecimalFormat("###,000원");
        String name = customer.getOrderName()+"번 "; //고객1번 
        StringBuffer message = new StringBuffer();
            message.append("\n\n ")
            .append("+----------------------------------------------------+\n ")
            .append("|                                                    | \n ")
            .append("|             " + name + "고객님 의 주문 내역 입니다         | " + "\n");

        for(Map.Entry<String, Integer> order : customer.getCoffeeOrder().entrySet()){
           String coffeeName = order.getKey(); //커피이름
           int orderCount = order.getValue(); //몇잔 주문했는지
           int coffeeUnitPrice = coffee.menu.get(coffeeName);  //커피가격
           coffeePrice= coffeeUnitPrice * orderCount;
           totalMoney = totalMoney + coffeePrice; 
           String pay = f.format(coffeePrice); // 가격 포맷팅
            message.append(String.format(" | [%d] %-20s : %2d잔  %7s |\n", s, coffeeName, orderCount, pay));
            s++; // 리스트 인덱스 증가
            message.append(" |                                                    |\n ")
            .append("+----------------------------------------------------+ \n")
            .append(" ============ 총 결제 금액은 " + f.format(totalMoney) + "입니다 ========== \n");
            System.out.println(message);
            payment(totalMoney);
        }


    }

    private void payment(int totalMoney) {
        System.out.println("\n결제를 도와 드리겠습니다 카드를 넣어주세요");
        int payResult = customer.getMoney() - totalMoney;
        try {
            System.out.println("결제중입니다");
            t.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(payResult < 0) {
            System.out.println("잔액부족. 주문을 다시 해주세요");
        } else {
            customer.setMoney(payResult);
            System.out.println("결제가 완료 되었습니다");
            System.out.println("이용해주셔서 감사합니다");
            orderNum++;
        }
    }

    private void order() {
        System.out.println("\n 취소를 원하시면 0번을 눌러주세요.");
        end:while (true) {
            try {
                System.out.println("\n 원하는 음료 번호 선택");
                String choice = sc.next();
                int choiceNum = Integer.parseInt(choice.substring(0,1));
                if(choiceNum == 0) {
                    System.out.println("주문취소");
                    System.exit(0); // 0을 주면 빠져나감
                }

                sc.nextLine();
                String coffeeName = coffee.coffeeList.get(choiceNum - 1);
                System.out.println("선택하신 음료는 : " + coffeeName + "입니다. 몇잔 주문 ?");
                int orderCount = sc.nextInt(); // 음료의 갯수 입력
                sc.nextLine();

                //재주문
                if(reOrder){
                    for(String coff : orderList.keySet()){ // 모든 커피이름을 가져와서 
                        if(coff.equals(coffeeName)) { //똑같은 커피를 주문하면
                            // 아메리카노 2
                            // 카페라떼 1
                            int addCount = orderList.get(coff).intValue() + orderCount;
                            // 주문리스트의 수량을 불러와서 현재 수량에 더한다.
                            orderList.replace(coffeeName, addCount); // 맵값을 변경
                        } else {
                            orderList.put(coffeeName,orderCount);
                            break;
                        }
                    }
                } else {
                    orderList.put(coffeeName,orderCount); //커피이름, 수량을 주문리스트에 담아 저장
                }
                customer.setCoffeeOrder(orderList);
                //추가주문
                addOrder();
                break end;

            } catch (Exception e) {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }

    private void addOrder() {
        reOrder = false;
        System.out.println("\n 주문을 계속 하시겠습니까?");
        System.out.println("예(Y)/아니오(N)");
        String yesOrNo = sc.next();
        if(yesOrNo.equals("예") || yesOrNo.equalsIgnoreCase("y")){
            coffee.getMenu();
            reOrder = true;
            order();

        } else if(yesOrNo.equals("아니오") || yesOrNo.equalsIgnoreCase("n")){
            return;
        }
    }

}
