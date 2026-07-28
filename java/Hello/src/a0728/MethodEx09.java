package a0728;

public class MethodEx09 {
    public static void main(String[] args) {
        System.out.println(isEven(10));
        System.out.println(isEven(7));
    }

    private static boolean isEven(int i) {
        return i % 2 == 0;

    }
}
