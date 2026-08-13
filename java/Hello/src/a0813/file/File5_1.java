package a0813.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class File5_1 {
    //예외를 JVM 넘겨줌 throws IOException
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("c:/Users/tjoeun/out.txt");
        for(int i = 1; i < 11; i++){
            String data = i + "번 쨰 줄입니다. \r\n";
            //window 줄바꿈 단어 \r\n 리눅스에선 \r
            output.write(data.getBytes());
        }
        output.close();
    }
    
}
