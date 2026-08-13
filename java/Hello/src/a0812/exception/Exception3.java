package a0812.exception;

public class Exception3 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위를 벗어났습니다.");
    }
}
}
