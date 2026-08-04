package a0804.interab;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("짹쨱", 1, "참새");
        Fish fish = new Fish("니모", 2, "바다");
        Duck duck = new Duck("도날드", 3, "노란색");
        System.out.println("==== 새 ====");

        bird.eat();
        bird.sleep();
        bird.makeSound();
        bird.move();
        bird.fly();

        System.out.println("\n==== 물고기 ====");
        fish.eat();
        fish.sleep();
        fish.makeSound();
        fish.move();
        fish.swim();

        System.out.println("\n==== 오리 ====");
        duck.eat();
        duck.sleep();
        duck.makeSound();
        duck.move();
        duck.fly();
        duck.swim();


        //다형성
        System.out.println("\n===다형성==="); // 부모타입으로 자식 객체를 관리하는 다형성
        Animal[] animals = {bird, fish, duck};
        for(Animal animal : animals){
            animal.makeSound();
            animal.move();
        }
        
        //인터페이스
        // 서로 다른 클래스들이 공통으로 가져야하는 행동을 강제
        Flyable[] flyables = {bird, duck}; // 같은 기능(날기)을 가진 객체를 하나로 관리
        for(Flyable flyable : flyables) {
            flyable.fly();
        }
        Swimmable[] swimmables = {fish, duck}; //같은 기능(수영)을 가진 객체를 하나로 관리
        for(Swimmable swimmable : swimmables) {
            swimmable.swim();
        }
    }
}
