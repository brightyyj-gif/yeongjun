package a0813.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File7_1 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw  = new PrintWriter("c:/Users/Tjoeun/out1.txt","UTF-8");
        for(int i = 1; i < 11; i++){
            String data = i + " 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();

        PrintWriter pw2  = new PrintWriter(new FileWriter("c:/Users/Tjoeun/out1.txt", true));
        //append 는 FileWriter에서 설정
        for(int i = 11; i < 21; i++){
            String data = i + " 번째 줄입니다.";
            pw2.println(data);
        }
        pw2.close();
    }
    
}
