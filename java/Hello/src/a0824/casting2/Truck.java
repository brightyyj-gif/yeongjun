package a0824.casting2;

public class Truck extends Vehicle {
    private int workHours;
    private double hourlyRate;
    public Truck(String name, int id, int baseFee, int workHours, double hourlyRate) {
        super(name, id, baseFee);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }
    
    @Override
    double calculateFee() {
        
        return baseFee + (workHours * hourlyRate);
    }
    void haulCargo() {
        System.out.println(workHours);
    }
}
