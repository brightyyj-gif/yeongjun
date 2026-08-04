package a0804.interface2;

public class AirConditionar implements RemoteControl{

    @Override
    public void powerOn() {
        System.out.println("에어컨 ON");
    }

    @Override
    public void powerOff() {
        System.out.println("에어컨 OFF");
    }
    
}
