package a0805.array;

public class Array {
    public static void main(String[] args) {
        //array
        //크기고정, 같은 자료형만 저장
        // 속도가 빠름
        //메모리를 적게사용

        //선언
        int[] score = new int[5];

        //데이터 저장
        score[0] = 90;
        score[1] = 80;
        score[2] = 70;
        score[3] = 100;
        score[4] = 95;

        //선언 및 데이터 저장
        int[] score1 = {90, 80, 70, 100, 95};

        for(int i = 0; i < score.length; i++){
            System.out.println(score[i]);
        }
        //향상for문
        for(int s :score1){
            System.out.println(s);
        }
    }
    
    
}
