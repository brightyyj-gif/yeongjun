package a0824.employeeCasting;

public class PartTimeEmployee extends Employee {
    private int workHours; // 일하는 시간
    private double hourlyRate; // 시간당 알바비
    public PartTimeEmployee(String name, int id, double baseSalary, int workHours, double hourlyRate) {
        super(name, id, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return baseSalary + (workHours * hourlyRate);
    }
    void workPartime(){
        System.out.println(name + "이(가) 시간제로 " + workHours + "시간 일합니다.");
    }
    
}
