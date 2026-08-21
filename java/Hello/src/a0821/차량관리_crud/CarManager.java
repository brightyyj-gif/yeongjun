package a0821.차량관리_crud;

import java.util.ArrayList;
import java.util.Scanner;

import a0805.array.Array;

public class CarManager {
    private ArrayList<Car> cars = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public CarManager() {
    cars.add(new Car("12가3456", "소나타", "흰색", 2022, 2500));
    cars.add(new Car("34나7890", "아반떼", "검정", 2021, 1800));
    cars.add(new Car("56다1234", "그랜저", "은색", 2023, 4200));
    cars.add(new Car("78라5678", "쏘렌토", "파랑", 2020, 3100));
    cars.add(new Car("90마9012", "소나타", "회색", 2024, 2800));
}

    public void run() {
        while(true){ //Menu 보임
            System.out.println("=================차량 관리 시스템===================");
            System.out.println("1. 차량 등록 (C)");
            System.out.println("2. 전체 조회 (R)");
            System.out.println("3. 차량 수정 (U)");
            System.out.println("4. 차량 삭제 (D)");
            System.out.println("5. 차량번호 검색");
            System.out.println("6. 차종으로 검색");
            System.out.println("0. 종료");
            System.out.print("선택> ");

            String menu = sc.nextLine();

            switch (menu) {
                case "1":
                    addCar();
                    break;
                 case "2":
                    printAll();
                    break; 
                 case "3":
                    updateEmployee();// 사원수정하기
                    break;
                //  case "4":
                //     deleteEmployee();// 사원삭제
                //     break; 
                //  case "5":
                //     searchEmployee();
                //     break;
                //  case "6":
                //     searchByDept();
                //     break;    
                case "0":
                    System.out.println("프로그램 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택");
            }

        }

    }

    private void updateEmployee() {
        System.out.print("수정할 차량번호: ");
        String carNumber = sc.nextLine();
        Car c = findByNumber(carNumber);

        if(carNumber != null){
            System.out.println("새 차종");

        }
    }

    // case 2
    private void printAll() {
        if(cars.isEmpty()){ 
             System.out.println("등록된 차량이 없습니다.");
            return; 
       }
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + cars.get(i));
        }
    }
        
    

    // case 1
    private void addCar() {
        System.out.print("차량번호 : ");
        String carNumber = sc.nextLine();

        //사번을 입력받아서 리스트에 없어야(중복방지) 새로운 직원등록
        if(findByNumber(carNumber) != null){
            System.out.println("이미 존재하는 사번입니다.");
            return;
        }
        System.out.print("차종: ");
        String model = sc.nextLine();
        System.out.print("색상: ");
        String color = sc.nextLine();
        System.out.print("연식: ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.print("가격: ");
        int price = Integer.parseInt(sc.nextLine());
        cars.add(new Car(carNumber, model, color, year, price)); 

    }

    private Car findByNumber(String carNumber) {
       for(Car c : cars){
            if(c.getCarNumber().equals(carNumber)){ 
                return c; // Employee 객체
            }
       }
       return null;
    }    
    
}

