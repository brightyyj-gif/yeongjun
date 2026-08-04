package a0804.interab;

public class Duck extends Animal implements Flyable, Swimmable {
    private String color;

    public Duck(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void swim() {
        System.out.println(name + "이(가) 수영합니다.");
    }

    @Override
    public void fly() {

    }

    @Override
    public void makeSound() {

    }

    @Override
    public void move() {

    }
    
    
}
