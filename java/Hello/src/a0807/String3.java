public class String3 {

    public static void main(String[] args) {
        String str = "";

        // 반복문 안에서 String 문자열 추가
        for (int i = 0; i < 100000; i++) {
            str += i; //매번 새로운 String 객체가 생성됨
        }
        System.out.println("완료");
        //0 01 012 0123 01234 012345 012345
    }
    
}
