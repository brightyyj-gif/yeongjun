package a0824.casting2;

abstract class Vehicle {
    protected String name;
    protected int id;
    protected int baseFee;
    public Vehicle(String name, int id, int baseFee) {
        this.name = name;
        this.id = id;
        this.baseFee = baseFee;
    }
    
    abstract double calculateFee();

    public String getName() {
        return name;
    }

    void printInfo() {
        System.out.println("ID: " + id + ", 이름: " + name + ", 기본요금: " +
            baseFee + ", 실요금: " + calculateFee());
    }

    
}
