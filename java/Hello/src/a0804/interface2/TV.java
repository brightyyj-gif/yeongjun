package a0804.interface2;

public class TV implements RemoteControl {

    @Override
    public void powerOn() {
        System.out.println("TV 전원 ON");
    }

    @Override
    public void powerOff() {
        System.out.println("TV 전원 OFF");
    }
    
}
