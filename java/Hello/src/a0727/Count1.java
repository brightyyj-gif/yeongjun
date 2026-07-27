package a0727;

public class Count1 {
    public static void main(String[] args) {
        //80점 이상인 학생 구하기
        int[] score = {90,85,70,100,95};

        int count = 0;
        
         for(int i = 0; i < score.length; i++) {
            if(score[i] >= 80) {
                count++;
            }
         }
         System.out.println("80점 이상: " + count);

    }
}
