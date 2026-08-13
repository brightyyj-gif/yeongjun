package a0812.exception;

import java.io.FileWriter;

public class FileWrite1 {
    public static void main(String[] args) {
        

        // c:\abc 폴더가 존재해야 합니다. 폴더없으며 IOException 에러가남
        try {
             FileWriter fw = new FileWriter("C:/abc/test.txt");
             fw.write("hi.\n");
             fw.write("Java Iput Output\n");
             fw.write("안녕하세요 자바스크립트");

            fw.close();

            System.out.println("파일 저장 완료!");
        } catch (Exception e) {
             System.out.println("파일 저장 실패!");
            System.out.println(e.getMessage());// 폴더가 없는경우 - C:\abc\test.txt (지정된 경로를 찾을 수 없습니다) 
        }

    }
}
