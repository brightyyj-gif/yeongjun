package a0724;

public class for1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for(int j = 5; j >= 1; j--) {
            System.out.println(j);
        }
        for(int k = 1; k <= 10; k++) {
            System.out.println(k += 1);
            // for(int k = 2; k<= 10; k += 2)
            // System.out.println(k);
        }

        int[] score = {90, 85, 78, 95, 88};
        int sum = 0;

        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score[3]);
        System.out.println(score[4]);
        System.out.println();

        for(int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
            sum = sum + score[i];
        }
        System.out.println(sum);
        double avg =(double) sum / 5;
        System.out.println(avg);

        System.out.println();
        //향상 for문

        for(int s: score){ // score의 배열을 s에 할당
            System.out.println(s);
        }

    }
}
