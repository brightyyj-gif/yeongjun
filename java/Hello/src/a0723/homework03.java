package a0723;

import java.util.Scanner;

public class homework03 {
    public static void main(String[] args) {
        int[] ary = new int[4];
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i < ary.length; i++) {
            System.out.print("점수 입력: ");
            ary[i] = sc.nextInt();
            sum += ary[i];
        }
        sc.close();
        System.out.printf("평균 : " + (sum/ary.length));

    }
}
