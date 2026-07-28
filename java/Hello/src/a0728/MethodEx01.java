package a0728;

public class MethodEx01 {
    // 함수(Method)는 특정 기능을 수행하는 코드묶음
    // 자주 사용하는 코드를 한 곳에 작성하고 필요시마다 호출
    public static void main(String[] args) {

        hello();
        hello();
        
    }
    // private 접근제어자 - MethodEx01 안에서만 호출 할 수 있다.
    //private 대신 public이 많이 쓰임
    private static void hello() {
        //static - 객체 생성 없이 호출가능
        //void - 는 리턴값이 없을 때
        System.out.println("안녕하세요");

    }
}
