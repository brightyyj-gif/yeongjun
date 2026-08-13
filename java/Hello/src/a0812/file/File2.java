package a0812.file;

import java.io.File;

public class File2 {
    public static void main(String[] args) {
        File file = new File("C:/abc/test.txt");
          if(file.exists()){ //파일 존재 여부 확인
            System.out.println("파일이 존재합니다.");
        }else{
            System.out.println("파일이 없습니다.");
        }
    }
}
