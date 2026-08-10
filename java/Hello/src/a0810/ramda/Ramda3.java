package a0810.ramda;

//"무엇을 할지"만 정의
interface Calculator{
    int sum(int a, int b);
}

// class MyCalculator implements Calculator {

    // @Override // 부모의 메소드를 재정의 한다.
    // public int sum(int a, int b) {
    //     return a + b;
    //     == (ㅁ, ㅠ) -
    // }

}
public class Ramda3 {
    public static void main(String[] args) {
        
        int result = mc.sum(3,4);
        System.out.println("result = " + result);
    }
}
