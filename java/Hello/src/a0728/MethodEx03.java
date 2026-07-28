package a0728;

//매개변수(parameter)는 함수에 전달한 값입니다.
//매개변수가 있는 함수

public class MethodEx03 {
    public static void main(String[] args) {
        hello("홍길동");
        hello("김철수");
    
    }

    private static void hello(String name) {
        System.out.println(name+ "환영합니다.");
    }
}
