package a0730.member2;

public class MemberTest {
    public static void main(String[] args) {

    Member m1 = new Member();
    Member m2 = new Member();
    Member m3 = new Member();


    m1.setName("홍길동");
    m1.setAge(25);
    m1.setEmail("hong@test.com");
        
    m2.setName("김철수");
    m2.setAge(30);
    m2.setEmail("kim@test.com");

    m3.setName("이영희");
    m3.setAge(22);
    m3.setEmail("lee@test.com");

    System.out.println(m1.getName());
    System.out.println(m1.getAge());
    System.out.println(m1.getEmail());
       
    System.out.println(m2.getName());
    System.out.println(m2.getAge());
    System.out.println(m2.getEmail());

    System.out.println(m3.getName());
    System.out.println(m3.getAge());
    System.out.println(m3.getEmail());
    }



    
}
