package a0811.academy;

import java.util.Scanner;

public class AcademyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        boolean flag = true;

        while (flag) {
            System.out.println("\n 학원 수강생 관리 시스템");
            System.out.println("1. 수강 가능한 학생 보기");
            System.out.println("2. 수강 등록하기");
            System.out.println("3. 수강 중인 학생 보기");
            System.out.println("4. 학생 추가하기");
            System.out.println("5. 학생 삭제하기");
            System.out.println("6. 학생 정보 수정하기");
            System.out.println("7. 학생 정보 조회하기");
            System.out.println("8. 종료");
            System.out.print("원하는 작업을 선택하세요 >>");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    manager.showAvailableStudents();
                    break;
                case 2:
                    System.out.print("등록할 학생 이름: ");
                    if (manager.enroll(sc.nextLine())) {
                        System.out.println("수강 등록이 완료되었습니다.");
                    } else {
                        System.out.println("학생이 없거나 이미 수강 중입니다.");
                    }
                    break;
                case 3:
                    System.out.println("수강 중인 학생 목록");
                    manager.enroll();
                    break;
                case 4:
                    System.out.print("학생 이름: ");
                    String name = sc.nextLine();
                    System.out.print("수강 과목: ");
                    String course = sc.nextLine();
                    System.out.print("연락처: ");
                    String phone = sc.nextLine();
                    System.out.print("점수: ");
                    int grade = sc.nextInt();
                    sc.nextLine();
                    manager.addStudent(name, course, phone, grade);
                    System.out.println("학생 추가 완료");
                    break;
                case 5:
                    System.out.print("삭제할 학생 이름: ");
                    manager.deleteStudent(sc.nextLine());
                    break;
                case 6:
                    System.out.print("수정할 학생 이름: ");
                    manager.updateStudent(sc.nextLine());
                    break;
                case 7:
                    System.out.print("조회할 학생 이름: ");
                    manager.showStudent(sc.nextLine());
                    break;
                case 8:
                    System.out.println("프로그램을 종료합니다.");
                    flag = false;
                    break;
                default:
                    System.out.println("1~8번 중에 입력하세요.");
            }
        }
        sc.close();
    }
}
