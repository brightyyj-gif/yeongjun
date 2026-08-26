package a0812.exception;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");

        try {

            int num = Integer.parseInt(sc.nextLine());

            System.out.println("입력한 숫자: " + num);

        } catch (NumberFormatException e) {

            System.out.println("숫자만 입력하세요.");

        }
        

        // afvws(문자를 입력할 경우) 숫자만 입력하세요. 프로그램 종료 프린트됨
        System.out.println("프로그램 종료");
        }

    }
      