package a0804.abstract2;

abstract class Employee {
    String name;

    public Employee(String name){
        this.name = name;
    }
    

    public void work() {
        System.out.println(name + "이(가) 근무 중입니다.");
    }
    
    //추상 메서드
    public abstract int getSalary();
}
