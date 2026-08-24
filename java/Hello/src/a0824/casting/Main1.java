package a0824.casting;

public class Main1 {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.x); // 변수(데이터) : 선언한 타입(Parent)를 따라감 -> 100이 나옴
        p.show(); // 메서드(동작) : 실제 생성된 객체(child)를 따라감 -> child의 show()를 실행 - 오버라이드
        // 오버라이드 된 child.show()가 실행됨
        
    }
}

class Parent{
    int x = 100;
    void show(){
        System.out.println("Parent: " + x);
    }
}

class Child extends Parent {
    int x = 200;
    void show(){
        System.out.println("Child: " + x);
    }
}