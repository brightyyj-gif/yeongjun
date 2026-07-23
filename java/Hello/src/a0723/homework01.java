package a0723;

import java.util.Scanner;

public class homework01 {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        array[0] = sc.nextInt();
        System.out.print("숫자 입력: ");
        array[1] = sc.nextInt();
        System.out.print("숫자 입력: ");
        array[2] = sc.nextInt();
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        

        sc.close();
        
    }
}
