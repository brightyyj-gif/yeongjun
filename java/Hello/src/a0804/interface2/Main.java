package a0804.interface2;

public class Main {
    public static void main(String[] args) {
        RemoteControl tv = new TV();
        RemoteControl air = new AirConditionar();

        tv.powerOn();
        tv.powerOff();
    }
}
