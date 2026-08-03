package a0803.employee;

public class Employee {
    
    private int empNo;
    private String name;
    private int salary;
    private int bonus;
    private int totalSalary;

    public Employee(int empNo, String name, int salary, int bonus) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
        calc();
    }

    private void calc() {
        totalSalary = salary + bonus;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
        calc();
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
        calc();
    }

    public int getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(int totalSalary) {
        this.totalSalary = totalSalary;
    }

    public void printInfo(){
        System.out.printf("%4d %-6s %7d %7d %7d\n", 
            empNo, name, salary, bonus, totalSalary
        );
    }
}
