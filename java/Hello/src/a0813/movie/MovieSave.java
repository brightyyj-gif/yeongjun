package a0813.movie;

import java.io.File;
import java.io.FileWriter;

public class MovieSave {
    public static void main(String[] args) {
        Movie[] movies = {
            new Movie("기생충", "봉준호", 2019),
            new Movie("인터스텔라", "Christopher Nolan", 2014),
            new Movie("어벤져스", "Anthony Russo", 2019)
        };

        File folder = new File("C:/abcdf"); //File 객체생성 -아직 폴더를 만들지 않았음

        if (!folder.exists()) { //실제폴더가 없다면
            folder.mkdir(); //폴더를 만들어라
        }

        File file = new File("C:/abcdf/movie.txt"); //파일을 가르키는 객체

        try {
            FileWriter fw = new FileWriter(file); //movie.txt 파일을 열어사 쓰기준비
            for (Movie m : movies) {
                fw.write("===== 영화 정보 =====\n");
                fw.write("제목 : " + m.getTitle() + "\n");
                fw.write("감독 : " + m.getDirector() + "\n");
                fw.write("개봉연도 : " + m.getYear() + "\n");
            }
            fw.close();
            System.out.println("영화 정보 저장 완료");
        } catch (Exception e) {
            System.out.println("저장 실패");
        }
        
    }
}
