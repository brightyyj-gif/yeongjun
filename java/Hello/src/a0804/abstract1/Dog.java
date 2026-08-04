package a0804.abstract1;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        
    }

    //오버라이드 구현
    @Override
    void makeSound() {
        System.out.println(name + "이(가) 멍멍 짖습니다.");
    }
    
}
