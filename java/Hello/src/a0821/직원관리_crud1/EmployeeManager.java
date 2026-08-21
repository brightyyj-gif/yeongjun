package a0821.직원관리_crud1;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    
    private ArrayList<Employee> list = new ArrayList<>(); //Employee 의 리스트 담을 arrayList
    private Scanner sc = new Scanner(System.in);

    public EmployeeManager() { // EmployeeManager 생성과 동시에 더미데이터를 넣는다.
        list.add(new Employee("E001", "홍길동", "개발팀", 3500));
        list.add(new Employee("E002", "김영희", "인사팀", 3200));
        list.add(new Employee("E003", "이철수", "영업팀", 3000));
        list.add(new Employee("E004", "박민수", "개발팀", 3800));
        list.add(new Employee("E005", "최지우", "기획팀", 3400));
    }

    public void run(){

        while(true){ //Menu 보임
            System.out.println("=================직원 관리 시스템===================");
            System.out.println("1. 직원 등록 (C)");
            System.out.println("2. 전체 조회 (R)");
            System.out.println("3. 직원 수정 (U)");
            System.out.println("4. 직원 삭제 (D)");
            System.out.println("5. 사번으로 검색");
            System.out.println("6. 부서로 검색");
            System.out.println("7. 연봉평균");
            System.out.println("8. 부서검색 평균");
            System.out.println("0. 종료");
            System.out.print("선택> ");

            String menu = sc.nextLine();

            switch (menu) {
                case "1":
                    addEmployee();// 회원 추가
                    //사번 을 입력하고 사번중복이 없으면 이름,부서,연봉 입력받고 List 에 add 추가
                    break;
                 case "2":
                    printAll();// 화면에 사원출력하기
                    break; 
                 case "3":
                    updateEmployee();// 사원수정하기
                    break;
                 case "4":
                    deleteEmployee();// 사원삭제
                    break; 
                 case "5":
                    searchEmployee();
                    break;
                 case "6":
                    searchByDept();
                    break;    
                case "7":
                    salaryAverage(); //전체 연봉
                    break;
                case "8":
                    deptSalaryAvg();
                    break;
                case "0":
                    System.out.println("프로그램 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택");
            }

        }

    }

    private void deptSalaryAvg() {
        System.out.print("부서 : ");
        String dept = sc.nextLine();

        //받아올 리스트 생성
        ArrayList<Employee> result = new ArrayList<>();
        for(Employee e :list){
            if(e.getDept().equals(dept)){
                result.add(e);
                //예를 들어 list(전체리스트)를 돌면서 영업부가 2개면  result 리스트에 추가
            }
        }
        if(result.isEmpty()){//결과가 비어있으면
            System.out.println("해당 부서 직원이 없습니다.");
            return;
        }
        int sum = 0;
        for(Employee e : result){
            sum +=e.getSalary();
        }
        double avg = (double)sum / result.size();
        System.out.println(dept + " 직원 " + result.size() + "명");
        System.out.println("연봉 합계: " + sum + "만원");
        System.out.printf("연봉 평균: %,1f만원\n", avg );
        
    }

    private void salaryAverage() {
        if(list.isEmpty()){
            System.out.println("등록된 직원이 없습니다.");
            return;
        }

        int sum = 0; //연봉 합계 변수
        for(Employee e : list){
            sum = sum + e.getSalary();
        }
        double avg = (double) sum / list.size();
        System.out.println("전체 직원 " + list.size() + "명");
        System.out.println("연봉 합계: " + sum + "만원");
        System.out.printf("연봉 평균: %.1f만원\n", avg);
    }

    private void searchByDept() { //여러개 리스트로 받아와야함
       System.out.print("검색할 부서:"); 
       String dept = sc.nextLine();

        //받아올 리스트 생성
        ArrayList<Employee> result = new ArrayList<>();
        for(Employee e :list){
            if(e.getDept().equals(dept)){
                result.add(e);
                //예를 들어 list(전체리스트)를 돌면서 영업부가 2개면  result 리스트에 추가
            }
        }
        if(result.isEmpty()){//결과가 비어있으면
            System.out.println("해당 부서 직원이 없습니다.");
            return;
        }
        System.out.println(dept + " 직원 "+ result.size() + "명");
        for(Employee e: result){
            System.out.println(e);
        }

    }

    private void searchEmployee() {
       System.out.print("검색할 사번:"); //유일한 키 - 한개의 객체만 받아오면됨
       String id = sc.nextLine();
       Employee e = findById(id);

       if(e == null){
         System.out.println("해당 사번이 없습니다.");
       }else{
         System.out.println(e);   
       }
    }

    private void deleteEmployee() {
       //사원이 있는지 확인
       //리스트에서 remove로 삭제
       System.out.print("삭제할 사번:");
       String id = sc.nextLine();
       Employee e = findById(id);

       if(e == null){
         System.out.println("해당 사번이 없습니다.");
         return;
       }

       list.remove(e);
       System.out.println("삭제되었습니다.");
    }

    private void updateEmployee() {
       // 수정할 사번이 있여야 수정이됨
       // id를 제외한 이름 부서  연봉 등을 입력받아 setter 메서드 이용 수정
       System.out.print("수정할 사번:");
       String id = sc.nextLine();
       Employee e = findById(id);

        if(e == null){
            System.out.println("해당 사번이 없습니다.");
            return;
        }
        System.out.print("새 이름(엔터=유지) : ");
        String name = sc.nextLine();
        if(!name.isEmpty()){
           e.setName(name);
        }
        System.out.print("새 부서(엔터=유지): ");
        String dept = sc.nextLine();
        if (!dept.isEmpty()) {
            e.setDept(dept);
        }

        System.out.print("새 연봉(엔터=유지): ");
        String salaryStr = sc.nextLine();
        if (!salaryStr.isEmpty()) {
            e.setSalary(Integer.parseInt(salaryStr));
        }
        //"E001", "김기방", "영업팀", 3500)
        System.out.println("수정되었습니다.");

    }
    private void printAll() {
       if(list.isEmpty()){ //사원이 아무도 없으면
             System.out.println("등록된 직원이 없습니다.");
            return; 
       }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + list.get(i));
        }
    }

    private void addEmployee() {
        System.out.print("사번 : ");
        String id = sc.nextLine();

        //사번을 입력받아서 리스트에 없어야(중복방지) 새로운 직원등록
        if(findById(id) != null){
            System.out.println("이미 존재하는 사번입니다.");
            return;
        }
        System.out.print("이름 : ");
        String name  = sc.nextLine();
        System.out.print("부서: ");
        String dept = sc.nextLine();
        System.out.print("연봉: ");
        int salary = Integer.parseInt(sc.nextLine()); //문자로 입력받아 숫자로 변화   "10000" -> 10000
        list.add(new Employee(id, name, dept, salary)); //Employee 생성자로 객체만들어서 list 추가
        System.out.println("직원이 등록되었습니다.");

    }

    private Employee findById(String id) {
       for(Employee e : list){
            if(e.getId().equals(id)){ //id와 list안에 있는 id 비교
                return e; // Employee 객체
            }
       }
       return null;
    }    


}
