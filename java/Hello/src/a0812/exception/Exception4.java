package a0812.exception;

public class Exception4 {
    public static void main(String[] args) {
        String str = "ABC";

        try {

            int num = Integer.parseInt(str); // 1은 숫자 인데  "1"  문자된 숫자를 변경할때 쓰임(Integer.parseInt)
            //완전문자인 ABC 들어가므로 예외처리    
        } catch (NumberFormatException e) {

            System.out.println("숫자만 입력하세요.");

        }
    }   
}
