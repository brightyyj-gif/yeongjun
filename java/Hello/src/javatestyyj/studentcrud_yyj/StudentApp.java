package javatestyyj.studentcrud_yyj;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        boolean run = true;

        while(run) {
            System.out.println("\n-----------------");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 검색");
            System.out.println("3. 학생 수정");
            System.out.println("4. 학생 삭제");
            System.out.println("5. 전체 출력");
            System.out.println("6. 종료");
            System.out.print("선택 > ");

            int menu;
        try {
            menu = Integer.parseInt(sc.nextLine()); 
        }catch (Exception e) { 
            System.out.println("숫자만 입력하세요");
            continue; 
        }

            switch (menu) {
                case 1:
                    System.out.print("이름 입력 : ");
                    String name = sc.nextLine();
                    int age;
                    while (true) {
                        System.out.print("나이 입력 : ");

                        try {
                            age = Integer.parseInt(sc.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("나이는 숫자로 입력하세요");
                        }
                    }
                    list.add(new Student(name, age));
                    System.out.println("학생 등록 완료");
                    break;
                
                case 2:
                    System.out.println("검색할 이름 : ");
                    name = sc.nextLine();
                    Student s = findStudent(list, name);
                    if (s != null) {
                        System.out.println(s);
                    } else{
                        System.out.println("학생이 없습니다.");
                    }
                    break;

                case 3:
                    System.out.print("수정할 이름 : ");
                    name = sc.nextLine();

                    Student student = findStudent(list, name);

                    if (student == null) {
                        System.out.println("해당 학생이 없습니다");
                        break;
                    }

                    int newAge;

                    while (true) {
                        System.out.print("새로운 나이 : ");

                        try {
                            newAge = Integer.parseInt(sc.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("나이는 숫자로 입력하세요");
                        }
                    }
                    

                    if (updateStudent(list, name, newAge)) {
                        System.out.println("수정 완료");
                    }
                    break;

                case 4:
                    System.out.print("삭제할 이름 : ");
                    name = sc.nextLine();
                    
                    if(deleteStudent(list, name)) {
                        System.out.println("삭제 완료");
                    }
                    break;

                case 5:
                    for(Student st : list) {
                        System.out.println(st.toString());
                    }
                    break;

                case 6:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("숫자만 입력하세요");
            }
        }
        sc.close();
    }


    static Student findStudent(ArrayList<Student> list, String name) {
        for (Student s : list) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    
    static boolean updateStudent(ArrayList<Student> list, String name, int newAge) {
        Student s = findStudent(list, name);

        if (s.getName().equals(name)) {
            s.setAge(newAge);
            return true;
        }

        return false;
    }

    
    static boolean deleteStudent(ArrayList<Student> list, String name) {
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name)) {
                list.remove(i);
                return true;
            }
        }

        return false;
    }

}