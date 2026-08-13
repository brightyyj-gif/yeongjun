package a0812.file;

import java.io.File;

public class File3 {
    public static void main(String[] args) {
        File folder = new File("C:/abcd");
          if(!folder.exists()){ //폴더가 존재하지 안으면
            folder.mkdir(); //make directory  폴더생성
            System.out.println("폴더 생성 완료");
        }else{
            System.out.println("이미 존재 합니다.");
        }
    }
}
