package a0812.exception;

import java.util.Scanner;

public class ExceptionEx01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         try {
            System.out.print("나이 입력 : ");

            int age = Integer.parseInt(sc.nextLine());

            if(age < 0){
                throw new Exception("나이는 음수가 될 수 없습니다."); //throw - 예외를 직접 발생시켜라
            }

        } catch (NumberFormatException e) {

            System.out.println("숫자만 입력 가능합니다.");

        } catch(Exception e){
            System.out.println(e.getMessage()); // 그밖예외는 예외메세지만 출력
        }

    }
}
