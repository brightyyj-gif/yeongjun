package a0803.employee;

public class Main1 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        // 더미데이터
        employees[0] = new Employee(1001, "홍길동", 3000000, 500000);
        employees[1] = new Employee(1002, "이순신", 3500000, 700000);
        employees[2] = new Employee(1002, "김유신", 2800000, 300000);
        employees[3] = new Employee(1004, "강감찬", 3200000, 400000);

        System.out.println("===== 학생 목록 =====");
        printEmployee(employees);
    }

    private static void printEmployee(Employee[] employees) {
        System.out.println("===========================================");
        System.out.println("사번    이름    기본급    보너스    총급여");
        System.out.println("===========================================");
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null){
                employees[i].printInfo();
            }
        }
    }
}
