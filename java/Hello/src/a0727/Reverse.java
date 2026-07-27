package a0727;

public class Reverse {
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50};
        //배열을 거꾸로 출력하시오
        for(int i = num.length-1; i >= 0; i--){
            System.out.println(num[i]);
        }
    }
}
