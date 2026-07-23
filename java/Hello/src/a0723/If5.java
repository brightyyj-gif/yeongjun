package a0723;

public class If5 {
    public static void main(String[] args) {
        //int age = 25;

        //if(age >= 20 && age < 30) { 20 ~ 29
        int age = 17;
        if(age < 19 || age >= 65) {
            System.out.println("할인대상");
        } else {
            System.out.println("성인요금입니다.");
        }
        
    }
}
