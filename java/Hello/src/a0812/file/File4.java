package a0812.file;

import java.io.File;

public class File4 {
    public static void main(String[] args) {
        File file = new File("C:/abc/test.txt");
          if(file.delete()){ //파일 존재 여부 확인
            System.out.println("삭제완료");
        }else{
            System.out.println("삭제실패");
        }
    }
}
// 파일 존재 여부 확인
// 폴더 생성
// 파일 삭제
// 파일 이름 변경
// 파일 크기 확인
// 파일 경로 확인


// 메서드	설명
// exists()	파일 존재 여부
// mkdir()	폴더 생성
// delete()	삭제
// getName()	파일 이름
// getPath()	경로
// length()	파일 크기(Byte)
// isFile()	파일인지 확인
// isDirectory()	폴더인지 확인