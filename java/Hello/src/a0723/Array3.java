package a0723;

public class Array3 {
    public static void main(String[] args) {
        int[] score = {90, 85, 78, 95, 88};
        // for(int i = 0; i < 5; i++) {
        // System.out.println(score[i]);
        // }
        for(int i = 0; i < score.length; i++) {
        //System.out.println(score[i]);
        System.out.println(i + "번째 인덱스" + score[i]);
        }
        //score.length 배열의 갯수 - 배열의 크기가 바뀌어도 코드를 수정할 필요가 없습니다.
    }
}
