package a0729.student1;

public class Main1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        s1.name = "홍길동";
        s1.age = 25;

        s1.hello();

        s2.name = "이사벨";
        s2.age = 27;

        s2.hello();
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s2.name);
        System.out.println(s2.age);
        // int a = 0;
        // System.out.println(a);
        
    }
}
