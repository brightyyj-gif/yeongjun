package a0804.interab;

public class Bird extends Animal implements Flyable {
    private String species;


    public Bird(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    //인터페이스 구현
    @Override
    public void fly() {
        System.out.println(name + "이(가) 하늘을 납니다.");
    }

    //추상메서드 구현
    @Override
    public void makeSound() {
        System.out.println(name + "이(가) 쨱쨱 웁니다.");
    }

    @Override
    public void move() {
        System.out.println(name + "이(가) 이동합니다..");
    }
    
}
