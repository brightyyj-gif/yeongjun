package a0813.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class File6 {
    //예외를 JVM 넘겨줌 throws IOException
    public static void main(String[] args) {

        try {
            FileOutputStream output = new FileOutputStream("c:/Users/tjoeun/out.txt");
            output.close();
        } catch (Exception e) {
            System.out.println("파일 처리중 오류발생");
        }
    }
    
}
