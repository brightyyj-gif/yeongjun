package a0727;

public class Max1 {
    public static void main(String[] args) {
        int[] score = {90,85,70,95,100};

        int max = score[0];
        //최고 점수를 찾아서 프린트 하시오

        for(int i = 1; i < score.length; i++) {
            if(score[i] > max) {
                max = score[i];
            }

        }
        System.out.println("최고점 : " + max);
    }
}
