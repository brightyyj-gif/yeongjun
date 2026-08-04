package a0804.interface1;

public class Airplane implements FlyAble{

    @Override
    public void fly() {
        System.out.println("비행기가 이륙합니다.");
    }
    
}
