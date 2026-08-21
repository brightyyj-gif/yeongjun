package a0821.직원관리_crud;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    public static void main(String[] args) {
    private ArrayList<Employee> list = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public EmployeeManager() {
        public EmployeeManager() {
        list.add(new Employee("E001", "홍길동", "개발팀", 3500));
        list.add(new Employee("E002", "김영희", "인사팀", 3200));
        list.add(new Employee("E003", "이철수", "영업팀", 3000));
        list.add(new Employee("E004", "박민수", "개발팀", 3800));
        list.add(new Employee("E005", "최지우", "기획팀", 3400));
    }
        
    }

    switch (menu) {
        case "1":
            addEmployee();
            break;

        case "2":
            printAll();
            break;

        case "3":
            updateEmploye();
            break;

        case "4":
            delectEmployee();
            break;

        case "5":
            searchEmployee();
            break;

        case "0":

        default:
            break;
    }

    private void searchEmployee(){
        System.out.println("검색할 사번");
        String id = sc.nextLine();
        Employee e = findById(id);

        if (e == null){
            System.out.println("해당 사번이 없습니다.");
        } else {
            System.out.println(e);
        }
    }
    
    private void delectEmployee() {
        //사원이 있는지 확인 
        //리스트에서 remove로 삭제
        System.out.println("삭제할 사번:");
        String id = sc.nextLine();
        Employee e = findById(id);
        if(e == null){
            System.out.println("해당 사번이 없습니다");
            return;
        }
        list.remove(e);
        System.out.println("삭제되었습니다.");
    }
    private void updateEmploye(){
        //수정할 사번이 있어야 수정이 됨
        System.out.println("수정할 사번:");
        String id = sc.nextLine();
        Employee e = findById(id);
        if(e == null){
            System.out.println("해당 사번이 없습니다");
            return;
        }
        System.out.print("새 이름(엔터=유지) : ");
        String name = sc.nextLine();
        if(!name.isEmpty()){
            e.setName(name);
        }
        System.out.print("새 부서(엔터=유지): ");
        String salaryStr = sc.nextLine();
        if(!salaryStr.isEmpty()) {
            e.setSalary(Integer.parseInt(salaryStr));
        }
    }
    
    private void printAll() {
        if(list.isEmpty()){
            System.out.println("등록된 직원이 없습니다.");
            return;
        }
        for(int i = 0; i < list.size(); i++) {
            System.out.println("[");
        }
    }
    
    public void run(){
        while (true) {
            
        }
    }
    

    }
} 
