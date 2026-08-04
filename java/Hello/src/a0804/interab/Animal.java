package a0804.interab;

abstract class Animal {
    protected String name; //protected는 같은 패키지에서만 접근 가능
    protected int age;
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //일반 메서드
    public void eat() {
        System.out.println(name + "이(가) 먹습니다.");

    }

    public void sleep() {
        System.out.println(name + "이(가) 잡니다.");
    }
    
    //추상 메서드
     public abstract void makeSound();
     public abstract void move();
}
