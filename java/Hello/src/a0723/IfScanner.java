package a0723;

import java.util.Scanner;

public class IfScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("점수입력 : " );
        int score = sc.nextInt(); // 키보드로 숫자를 입력 받아 score에 저장
        if(score >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
        sc.close();
    }
}
