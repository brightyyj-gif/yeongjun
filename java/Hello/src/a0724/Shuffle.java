package a0724;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        
        for(int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }
        System.out.println();
        //유틸리티 클래스 - 배열의 내용을 문자열로 변환하여 반환하는 메소드
        System.out.println(Arrays.toString(numArr));
        
        for(int i = 0; i < 100; i++) {
            int n = (int)(Math.random() * 10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }
    
}
