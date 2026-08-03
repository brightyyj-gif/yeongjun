package a0803.over;

// 생성자를 여러개 만들어 객체를 다양한 방법으로 생성할 수 있다.
public class Main4 {
    public static void main(String[] args) {
    Student s1 =new Student();

    Student s2 =new Student("홍길동");

    Student s3 =new Student("이순신", 25);

    
    System.out.println(s2.name);
    }
    
}
