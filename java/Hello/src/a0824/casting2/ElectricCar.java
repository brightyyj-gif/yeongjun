package a0824.casting2;

public class ElectricCar extends Vehicle {
    private int batteryCare;
    private int seats;
    public ElectricCar(String name, int id, int baseFee, int batteryCare, int seats) {
        super(name, id, baseFee);
        this.batteryCare = batteryCare;
        this.seats = seats;
    }
    
    @Override
    double calculateFee() {
        return baseFee + batteryCare + seats;
    }
    void chargeBattery() {
        System.out.println(seats + "");
    }
}
