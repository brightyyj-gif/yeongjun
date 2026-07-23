package a0723;

public class If4 {
    public static void main(String[] args) {
        //중첩 if
        int age = 25;
        boolean member = true;

        if(age >= 20) {
            if(member) {
                System.out.println("성인회원 입니다.");
            }
        }
    }
}
