package hakjum;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        // 학생을 저장할 ArrayList 생성

        //더미데이터
        students.add(new Student("홍길동", "20260001"));
        students.add(new Student("김영희", "20260002"));
        System.out.println(students.get(0));

        students.get(0).setGrade(85);
        students.get(1).setGrade(90);
        students.add(new Student("이매리", "20260003", 75));
        // 생성자이름이 같아도 매개변수갯수나 타입이 다르면 생성자 오버로딩
    
        boolean condition = true;
        while (condition) {
            System.out.println("1. 학생 등록");
            System.out.println("2. 성적 입력");
            System.out.println("3. 성적 출력");
            System.out.println("4. 점수 수정");
            System.out.println("5. 학생 삭제");
            System.out.println("6. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 버퍼 지우기

            switch (choice) {
                case 1:
                    System.out.println("이름 입력: ");
                    String name = scanner.nextLine();
                    System.out.println("학번 입력: ");
                    String studentId = scanner.nextLine();
                    Student student = new Student(name, studentId);
                    students.add(student);

                    System.out.println("학생 등록 완료!");
                    break;
                
                case 2:
                    System.out.println("===성적 입력===");
                    System.out.print("학번 입력: ");
                    String id = scanner.nextLine();
                    Student foundStudent = findStudentById(students, id); //찾은 한명의 학생데이터
                    if(foundStudent != null) {
                        System.out.print("성적 입력: ");
                        int grade = scanner.nextInt();
                        foundStudent.setGrade(grade);
                        System.out.println("성적 입력 완료");
                    } else {
                        System.out.println("해당 학번을 가진 학생이 없습니다.");
                    }
                    break; 


                case 3:
                    System.out.println("성적 출력");
                    for(Student s : students) {
                        System.out.println(s);
                    }
                    break;

                case 4: //점수 수정
                    System.out.println("===점수 수정===");
                    System.out.print("학번 입력: ");
                    String updateId = scanner.nextLine();
                    Student updateStudent = findStudentById(students, updateId);
                    if(updateStudent != null){
                        System.out.println("현재 성적: " + updateStudent.getGrade());
                        System.out.print("새 성적 입력: ");
                        int newGrade = scanner.nextInt();
                        scanner.nextLine();
                        updateStudent.setGrade(newGrade);
                        System.out.println("성적수정 완료");
                    } else {
                        System.out.println("해당 학번을 가진 학생이 없습니다.");
                    }
                    break;
                    
                case 5: // 점수 삭제
                    System.out.println("===학생 삭제===");
                    System.out.print("학번 입력: ");
                    String deleteId = scanner.nextLine();
                    Student deleteStudent = findStudentById(students, deleteId);
                    if(deleteId != null){
                        students.remove(deleteStudent); //
                        System.out.println("학생삭제 완료");
                    } else {
                        System.out.println("해당 학번을 가진 학생이 없습니다.");
                    }
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세여");
                    break;
            }
            
        }
    }

    private static Student findStudentById(ArrayList<Student> students, String id) {
        for (Student s : students) {
            if(s.getStudentId().equals(id)){
                return s;
            }
        }
        return null;
    }
    
}
