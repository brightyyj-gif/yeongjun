package a0804.abstract2;

public class PartTime extends Employee{

    public PartTime(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        return 1800000;
    }
    
}
