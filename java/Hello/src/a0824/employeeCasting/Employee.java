package a0824.employeeCasting;

// 직원관리 시스템
// 추상클래스 ? 의미 : Employee(직원)라는 개념은 존재하지만 그냥 직원은 없음(정규직, 계약직, 파트타임)
// 추상클래스 특징 : 직접객체생성 불가 (Employee e = new Employee) X
// 반드시 자식 클래스에 상속해 주기 위해서만 존재하는 설계도 및 규격서
abstract class Employee {
    protected String name;
    protected int id;
    protected double baseSalary;
    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }
    
    // 추상메서드 : 정규직(기본급 + 보너스), 계약직(기본급고정), 파트타임(일한시간 * 시급) 직원타입마다 다름
    // protected 같은 패키지(폴더) 내부, 클래스를 상속받은 자식 클래스
    abstract double calculateSalary();

    public String getName() {
        return name;
    }

    // public int getId() {
    //     return id;
    // }

    // public double getBaseSalary() {
    //     return baseSalary;
    // }
    
    // 공통 메서드
    void printInfo() {
        System.out.println("ID: " + id + ", 이름: " + name +
                                ", 기본급: " + baseSalary +
                                ", 실급여: " + calculateSalary());
    }
}
