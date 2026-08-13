package a0813.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class File5 {
    //예외를 JVM 넘겨줌 throws IOException
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("c:/Users/tjoeun/out.txt");
        // FileOutputStream output - 파일 출력 객체를 만든다.
        // new FileOutputStream("c:/Users/TJ/out.txt");
        output.close();
    }
    
}
