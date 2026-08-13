package a0812.file.student1;

import java.io.File;
import java.io.FileWriter;

public class StudentSave {
    public static void main(String[] args) {
        Student[] students = { // 3명의 배열객체 생성
                new Student("홍길동",20,"컴퓨터공학"),
                 new Student("김철수",21,"전자"),
                  new Student("이영희",22,"AI")
            };
        File folder = new File("C:/abcdf"); //폴더 객체를 만듦 - 실제 폴더만든것은 아님

        if(!folder.exists()){
            folder.mkdir();//폴더 없으면 폴더만듦
        }

        File file = new File("C:/abcdf/student.txt"); //객체만 만든거임

        try { //권한없음, 디스크오류, 경로오류시 예외발생
            FileWriter fw = new FileWriter(file); //student.txt 생성
            for(Student s: students){
                fw.write("===== 학생 정보 =====\n");
                fw.write("이름 : " + s.getName() + "\n");
                fw.write("나이 : " + s.getAge() + "\n");
                fw.write("전공 : " + s.getMajor() + "\n");
            }
            fw.close();

            System.out.println("학생 정보 저장 완료");

        } catch (Exception e) {
             System.out.println("저장 실패");
        }
    }
}
