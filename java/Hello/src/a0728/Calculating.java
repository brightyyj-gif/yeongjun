package a0728;

import java.util.Scanner;

public class Calculating {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        

        while(true) {
            menu();

            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    add();
                    break;

                case 2:
                    subtract();
                    break;
                
                case 3:
                    break;
                
                case 4:
                    break;
                
                case 5:
                    break;
                default:
                    break;
            }

        }
        
    }
    private static void subtract() {
        int num1 = sc.nextInt();

        int num2 = sc.nextInt();
        System.out.println("빼기 결과 : " + (num1 - num2));

    }
    private static void add() {
        int sum = 0;
        // System.out.print("첫 번째 숫자 : ");

        // System.out.print("두 번째 숫자 : ");
        // int num2 = sc.nextInt();
        // System.out.println("더하기 결과 : " + (num1 + num2));
        while(true){
           int num1 = sc.nextInt();
            

            if(num1 == 0) {
                break;
            }
            sum += num1;
        }
        System.out.println("합계 : " + sum);
        

    }
    public static void menu() {
        System.out.println("\n==================================");
        System.out.println("     계산기");
        System.out.println("=========================");
        System.out.println("1. 더하기");
        System.out.println("2. 빼기");
        System.out.println("3. 곱하기");
        System.out.println("4. 나누기");
        System.out.println("5. 종료");
        System.out.printf("메뉴 선택 : ");
    }
}
