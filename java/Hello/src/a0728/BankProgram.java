package a0728;

import java.util.Scanner;

public class BankProgram {
    //객체없이 메인 바깥에서 변수를 실행하면 안됨
    //static을 붙이면 객체 바깥에서 변수를 실행해도됨
    static int balance = 100000; //초기 잔액 100000원
    static Scanner sc = new Scanner(System.in);
    //static -> 프로그램이 시작될 때 한 번만 만들어지는 공용변수/메서드
    //일반 변수 -> 객체를 만들어야 사용할 수 있는 변수
    public static void main(String[] args) {
        while (true) {
            menu();
            //키보드로 번호 선택
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    deposit();
                    break;
                
                case 2:
                    withdraw();
                    break;
                
                case 3:
                    showBalance();
                    break;

                case 4:
                    System.out.println("프로그램을 종료합니다");
                    return;
                    
                default:
                    System.out.println("잘못입력했습니다");
            }
            
        }
    }
    private static void showBalance() {
        System.out.println("현재 잔액 : " + balance + "원");
    }
    private static void withdraw() {
        System.out.print("출금할 금액 : ");
        int money = sc.nextInt();
        if(balance >= money) {
        balance -= money;
        System.out.println(money + "원이 출금되었습니다.");
        System.out.println("현재 잔액 : " + balance + "원");
        }else {
            System.out.println("잔액이 부족합니다.");
        }
    }
    //입금
    private static void deposit() {
        System.out.print("입금할 금액 : ");
        int money = sc.nextInt();
        
        balance += money;
        System.out.println(money + "원이 입금되었습니다.");
        System.out.println("현재 잔액 : " + balance + "원");
    }

    //메뉴 출력
    public static void menu() {
        System.out.println("\n==================================");
        System.out.println("     은행 프로그램");
        System.out.println("=========================");
        System.out.println("1. 입금");
        System.out.println("2. 출금");
        System.out.println("3. 잔액조회");
        System.out.println("4. 종료");
        System.out.print("메뉴 선택 : ");
    }
}
