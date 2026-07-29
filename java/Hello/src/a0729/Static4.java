package a0729;

public class Static4 {
    public static void main(String[] args) {
        Static4 st = new Static4();
        st.hello();
        //함수도 static을 붙이면 객체 생성이 필요없다.
    }

    private static void hello() {
        System.out.println("안녕하세요");
    }
}
