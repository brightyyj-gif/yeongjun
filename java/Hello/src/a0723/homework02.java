package a0723;

import java.util.Scanner;

public class homework02 {
    public static void main(String[] args) {
        int[] ary = new int[5];
        int sum = 0;

        Scanner sc = new Scanner(System.in);
       for(int i = 0; i < ary.length; i++) {
            System.out.print("숫자 입력: ");
            ary[i] = sc.nextInt();
            sum += ary[i];
        }
        sc.close();
        System.out.println("합계 : " + sum);
    }
}
