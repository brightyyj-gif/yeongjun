package a0727;

public class For_continue {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            if(i == 3) {


                continue;
                // 건너 뛰어라

            }
            System.out.println(i);
        }
    }
}
