package a0723;

import java.util.Scanner;

public class IfScanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자:");
        int score = sc.nextInt();
        if(score > 0) {
            System.out.println("양수입니다.");
        } else {
            System.out.println("양수가 아닙니다.");
        }

        sc.close();


    }
    
}
