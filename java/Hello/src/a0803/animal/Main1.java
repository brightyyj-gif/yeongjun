package a0803.animal;

// 상속을 하는 이유
//같은 코드를 여러번 작성하지 않아도 된다.
//코드의 재사용성
// 유지보수 용이
//클래스 간의 관계를 표현 할 수 있다.
public class Main1 {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.name = "초코";
        System.out.println(dog.name);
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.name = "냐옹";
        System.out.println(cat.name);
        cat.eat();
        cat.yang();
    }
}
