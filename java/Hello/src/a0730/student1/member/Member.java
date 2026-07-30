package a0730.student1.member;

public class Member {
    String name;
    int age;
    String email;

    public Member(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    


    public void showInfo() {
        System.out.println("회원이름: " + name);
        System.out.println("나이 : " + age);
        System.out.println("이메일 : " + email);
    }
    


    
    
}
