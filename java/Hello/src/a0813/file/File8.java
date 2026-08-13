package a0813.file;

import java.io.FileInputStream;
import java.io.IOException;

public class File8 {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("c:/Users/Tjoeun/out.txt");
        input.read(b);
        System.out.println(new String(b));
         input.close();
    }
}
