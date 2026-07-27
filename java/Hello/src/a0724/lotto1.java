package a0724;

import java.util.Arrays;

public class lotto1 {
    public static void main(String[] args) {
        //ball이라는 변수에 45개 정수값을 저장하기위한 배열 생성
        int[] ball = new int[45];

        for(int i = 0; i < ball.length; i++) {
            ball[i] = i + 1; //ball[0] = 1;

        }
        int tmp = 0; // 두 값을 바꾸는데 사용하는 임시변수
        int j = 0; //임의의 값을 얻어서 저장할 변수

        // 배열 1번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
        // 0부터 5번째 요소 6개만 바꾼다.
        for(int i = 0; i < 6; i++) {
            j = (int)(Math.random() * 45);
            // j는 0부터 44까지 랜덤한 임의의 값을 가진다.
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;

        }
        System.out.println(Arrays.toString(ball));
        System.out.println();
        for(int i = 0; i < 6; i++) {
            System.out.printf("ball[%d] = %d\n", i, ball[i]);
        }
    }
}
