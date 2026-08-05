package a0805.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        list.add(new Student("홍길동", 90));
        list.add(new Student("김영희", 85));
        list.add(new Student("이철수", 78));
        while(run){
            System.out.println("------------------------");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 검색");
            System.out.println("3. 학생 수정");
            System.out.println("4. 학생 삭제");
            System.out.println("5. 전체 출력");
            System.out.println("6. 종료");
            System.out.print("선택 > ");

            int menu;
        try {
            menu = Integer.parseInt(sc.nextLine()); //문자 1, 2, 3으로 입력받아 숫자로 변환
        }catch (Exception e) { //예외발생 (a 라는 문자입력
            System.out.println("숫자를 입력하세요");
            continue; //while문으로 다시 선택할 수 있게 해준다.
        }

        switch (menu) {
            case 1:
                System.out.print("이름 : ");
                String name = sc.nextLine();
                System.out.print("점수 : ");
                int score = Integer.parseInt(sc.nextLine());

                list.add(new Student(name, score));
                System.out.println("등록 완료");
                break;

            case 2:
                System.out.print("검색할 이름 : ");
                name = sc.nextLine();

                Student s = findStudent(list, name);
                if (s != null) {
                    System.out.println(s);
                } else {
                    System.out.println("학생이 없습니다.");
                }
                break;

            case 3:
                System.out.print("수정할 이름 : ");
                name = sc.nextLine();

                System.out.print("새 점수 : ");
                score = Integer.parseInt(sc.nextLine());

                if (updateStudent(list, name, score)) {
                    System.out.println("수정 완료");
                } else {
                    System.out.println("학생이 없습니다.");
                }
                break;

            case 4:
                System.out.print("삭제할 이름 : ");
                name = sc.nextLine();

                if (deleteStudent(list, name)) {
                    System.out.println("삭제 완료");
                } else {
                    System.out.println("학생이 없습니다.");
                }
                break;

            case 5:
                for (Student st : list) {
                    System.out.println(st.toString());
                }
                break;

            case 6:
                run = false;
                System.out.println("프로그램 종료");
                break;

            default:
                System.out.println("1~6 사이의 숫자를 입력하세요.");
        }
    }

    sc.close();
}

// 학생 검색
static Student findStudent(ArrayList<Student> list, String name) {
    for (Student s : list) {
        if (s.getName().equals(name)) {
            return s;
        }
    }
    return null;
}

// 학생 수정
static boolean updateStudent(ArrayList<Student> list, String name, int newScore) {

    for (Student s : list) {

        if (s.getName().equals(name)) {
            s.setScore(newScore);
            return true;
        }
    }

    return false;
}

// 학생 삭제
static boolean deleteStudent(ArrayList<Student> list, String name) {

    for (int i = 0; i < list.size(); i++) {

        if (list.get(i).getName().equals(name)) {
            list.remove(i);
            return true;
        }
    }

    return false;
}
}

