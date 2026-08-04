package a0804.abstract1;

public class MainAni1 {
    public static void main(String[] args) {
        // Animal animal = new Animal("동물") - 객체생성물가
        Animal dog = new Dog("뽀삐");
        Animal cat = new Cat("나비");
        dog.eat();
        dog.makeSound();

        cat.eat();
        cat.makeSound();
    }
}
