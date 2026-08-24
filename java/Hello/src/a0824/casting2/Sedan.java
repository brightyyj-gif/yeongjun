package a0824.casting2;

public class Sedan extends Vehicle {
    private int insurance;
    public Sedan(String name, int id, int baseFee, int insurance) {
        super(name, id, baseFee);
    }
    



@Override
double calculateFee() {
    return insurance + baseFee;
}
void driveSedan() {
    System.out.println("");
}
}
