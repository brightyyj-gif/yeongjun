package a0724;

public class for2 {
    public static void main(String[] args) {
        for(int i = 5; i > 0; i--) {
            for(int j = 1; j <= i; j++) { // i가 1일 때 j는 5번
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
