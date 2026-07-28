package a0728;

//배열의 합 구하기
public class MethodEx08 {
    public static void main(String[] args) {
        int[] score = {90,80,70,100};

        System.out.println(average(score));
    }

    public static double average(int[] arr) {
        int avg = 0;
        for(int i = 0; i < arr.length; i++) {
            avg += arr[i];
            
        }
        return avg / 4;
       
    }
     
}


