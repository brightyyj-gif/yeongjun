package a0811.academy;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    private ArrayList<Student> students;
    private ArrayList<Student> enrolledList;

    public StudentManager() {
        students = new ArrayList<>();
        enrolledList = new ArrayList<>();
        students.add(new Student("Kim Minsoo", "Java", "010-1111-2222", 85));
        students.add(new Student("Lee Jieun", "Python", "010-3333-4444", 92));
        students.add(new Student("Park Junho", "Web", "010-5555-6666", 78));
    }

    public void showAvailableStudents() {
        System.out.println("수강 가능한 학생");
        for (Student student : students) {
            if (!student.isEnrolled()) {
                System.out.println(student);
            }
        }
    }

    public boolean enroll(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name) && !student.isEnrolled()) {
                student.enroll();
                enrolledList.add(student);
                return true;
            }
        }
        return false;
    }

    public void enroll() {
        for (Student student : enrolledList) {
            System.out.println(student);
        }
    }

    public void addStudent(String name, String course, String phone, int grade) {
        students.add(new Student(name, course, phone, grade));
    }

    public void deleteStudent(String name) {
        boolean result = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                if (!student.isEnrolled()) {
                    students.remove(student);
                    result = true;
                }
                break;
            }
        }
        System.out.println(result ? "삭제됨" : "삭제안됨");
    }

    public void updateStudent(String name) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.print("수정 항목\n1. 이름\t2. 과목\t3. 연락처\t4. 점수\n >>");
                int menu = sc.nextInt();
                sc.nextLine();
                switch (menu) {
                    case 1:
                        System.out.print("수정할 이름: ");
                        student.setName(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("수정할 과목: ");
                        student.setCourse(sc.nextLine());
                        break;
                    case 3:
                        System.out.print("수정할 연락처: ");
                        student.setPhone(sc.nextLine());
                        break;
                    case 4:
                        System.out.print("수정할 점수: ");
                        student.setGrade(sc.nextInt());
                        sc.nextLine();
                        break;
                    default:
                        System.out.println("1~4번 중에 입력하세요");
                        return;
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("찾는 학생이 없어서 수정할 수 없습니다.");
        }
    }

    public void showStudent(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student);
            }
        }
    }
}
