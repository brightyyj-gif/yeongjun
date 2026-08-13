package a0812.exception;

import java.util.Scanner;

public class Execption5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        try {
            System.out.print("숫자 입력 : ");

            int num = Integer.parseInt(sc.nextLine());

            System.out.println(num);

        } catch (NumberFormatException e) {

            System.out.println("숫자만 입력 가능합니다.");

        }

    }
}
