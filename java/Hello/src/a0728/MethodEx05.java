package a0728;


// 두 수 중 큰 수 구하기
public class MethodEx05 {
    public static void main(String[] args) {
        System.out.println(max(10,20));
    }

    private static int max(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }

    }
}
