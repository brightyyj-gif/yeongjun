package a0803.over;


// 오버로딩(overloading)
// 오버로딩이란 같은 이름의 메서드를 여러개 만드는 것
// 1. 메서드의 이름은 같아야 한다.
// 매개변수의 갯수 또는 자료형이 달라야한다.
public class Main3 {
    public static void main(String[] args) {
        Calculator ca = new Calculator();

        System.out.println(ca.add(10, 20));
        System.out.println(ca.add(10.4, 20.3));
        System.out.println(ca.add(10, 20, 30));
    }
}
