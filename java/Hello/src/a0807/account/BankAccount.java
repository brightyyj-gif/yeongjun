package account;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accountList = new ArrayList<>();
        boolean condition = true;
        while (condition) {
            System.out.println("----------------------------------------------------------");
            System.out.print("1. 계좌생성 | ");
            System.out.print("2. 계좌목록 | ");
            System.out.print("3. 예금 | ");
            System.out.print("4. 출금 | ");
            System.out.println("5. 종료");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 지우기
            
            switch (choice) {
                case 1:
                    System.out.print("이름 입력: ");
                    String owner = scanner.nextLine();
                    System.out.print("계좌생성: ");
                    String ano = scanner.nextLine();
                    System.out.print("초기입금금액: ");
                    int balance = scanner.nextInt();
                    Account account = new Account(ano, owner, balance);
                    accountList.add(account);
                    
                    System.out.println("계좌생성 완료");
                    break;
                
                case 2:
                    System.out.println("계좌목록");
                    for(Account acc : accountList) {
                        System.out.println(acc);
                    }
                    break;

                case 3:

                default:
                    break;
            }
        }
    }

        
    }



   



