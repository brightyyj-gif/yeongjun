package a0812.exception;

public class Exception3 {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        try { // 예외가 발생할 가능성이 있는 코드
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위를 벗어났습니다." + e.getMessage());
            e.printStackTrace();

            // e.getMessage예외 메세지
            // e.printStackTtace(); 예외발생시 메세지 호출 과정
    }
}
}
