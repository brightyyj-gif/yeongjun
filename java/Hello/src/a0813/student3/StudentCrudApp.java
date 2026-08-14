package a0813.student3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentCrudApp {
    private static final String FILE_NAME = "students.txt";
    private static List<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        loadFromFile();

        while (true) {
            System.out.println("\n========== 학생 관리 시스템 (CRUD) ==========");
            System.out.println("1. 학생 조회 (Read)");
            System.out.println("2. 학생 등록 (Create)");
            System.out.println("3. 학생 수정 (Update)");
            System.out.println("4. 학생 삭제 (Delete)");
            System.out.println("5. 프로그램 종료 (Exit)");
            System.out.print("메뉴 선택: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자로 입력해주세요.");
                continue;
            }

            switch (choice) {
                case 1:
                    readStudents();
                    break;
                case 2:
                    createStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("올바른 메뉴 번호를 선택해주세요.");
            }
        }
            
    }
    private static void deleteStudent() {
        System.out.println("\n--- [학생 정보 삭제] ---");
        System.out.print("학번 입력: ");
        String id = scanner.nextLine();
        // boolean removed = false;
        // for (int i = 0; i < students.size(); i++) {
        //     if (students.get(i).getId().equals(id)) {
        //     students.remove(i);
        //     removed = true;
        //     break;
        //     }
        // }
        boolean removed = students.removeIf(s -> s.getId().equals(id));
        if(removed){
            saveToFile();
            System.out.println("학생 정보가 성공적으로 삭제");
        } else{
            System.out.println("해당학생이 없어요");
        }


    }
    private static void updateStudent() {
        System.out.println("\n--- [학생 정보 수정] ---");
        System.out.print("학번 입력: ");
        String id = scanner.nextLine();

        Student target = null;
        for(Student s : students){
            if(s.getId().equals(id)){
                target = s;
                break;
            }
        }
        if(target == null){
            System.out.println("해당 학번의 학생을 찾을 수 없습니다.");
            return;
        }
        System.out.print("새로운 이름 (기존: " + target.getName() + ", 변경 안 하려면 엔터): ");
        String name = scanner.nextLine();
        System.out.print("새로운 나이 (기존: " + target.getAge() + ", 변경 안 하려면 엔터): ");
        String ageStr = scanner.nextLine();

        if (!name.isEmpty()) {
            target.setName(name);
        }
        if (!ageStr.isEmpty()) {
            try {
                target.setAge(Integer.parseInt(ageStr)) ;
            } catch (NumberFormatException e) {
                System.out.println("나이 형식 오류로 나이는 수정되지 않았습니다.");
            }
        }

        saveToFile(); // 변경사항 파일에 반영
        System.out.println("학생 정보가 수정되었습니다.");

    }
    private static void createStudent() {
        System.out.println("\n--- [학생 정보 등록] ---");
        System.out.print("학번 입력: ");
        String id = scanner.nextLine();
        System.out.print("이름 입력: ");
        String name = scanner.nextLine();
        System.out.print("나이 입력: ");
        
        int age; //나이 예외처리
        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("나이는 숫자로 입력해야 합니다. 등록이 취소됩니다.");
            return;
        }

        students.add(new Student(id, name, age)); //리스트 추가 메모리에 저장
        saveToFile(); //변경사항
        System.out.println("새로운 학생이 성공적으로 등록되었습니다.");
    }
    private static void readStudents() {
        System.out.println("\n 학생 목록 조회");
        if(students.isEmpty()){ //리스트가 없으면
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        for(int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out.printf("%d. 학번: %s | 이름: %s | 나이: %d\n", (i + 1), s.getId(), s.getName(), s.getAge());
        }
        
    }
    private static void loadFromFile() {
        File file = new File(FILE_NAME); //student.txt
        if(!file.exists()) {
            System.out.println("저장된 파일이 없어 기본 더미 데이터를 생성합니다.");
            students.add(new Student("202601", "홍길동", 20));
            students.add(new Student("2026002", "김철수", 22));
            students.add(new Student("2026003", "이영희", 21));
            //현재 메모리에 저장됨
            saveToFile();
        }else { //파일이 있으면 학생을 불러옴
            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){//파일을 열어서 문자저장
                String line;
                while((line = reader.readLine()) != null){
                    Student s = Student.fromString(line); //객체생성 없이 메서드 부를때
                    if(s != null){
                        students.add(s);
                    }
                }
            
            System.out.println("파일에서 학생 데이터를 성공적으로 불러 왔습니다.");
       } catch (Exception e) {
        System.out.println("파일 저장 중 오류 발생" + e.getMessage());
       }
    }

    }
    
    private static void saveToFile() {
        //버퍼라이터는 한꺼번에 저장가능 속도빠름
       try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))){//파일을 열어서 문자저장
            for(Student s : students){
                writer.write(s.toString());
                writer.newLine();
            }
       } catch (Exception e) {
        System.out.println("파일 저장 중 오류 발생" + e.getMessage());
       }
    }
}
