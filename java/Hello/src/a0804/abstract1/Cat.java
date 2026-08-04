package a0804.abstract1;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    void makeSound() {
        System.out.println(name + "이(가) 야옹 웁니다.");
    }
    
}
