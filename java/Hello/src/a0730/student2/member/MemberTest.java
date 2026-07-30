package a0730.student2.member;

public class MemberTest {
    public static void main(String[] args) {

    Member m1 = new Member("홍길동", 25, "hong@test.com");
    Member m2 = new Member("홍길동", 25, "hong@test.com");
    Member m3 = new Member("홍길동", 25, "hong@test.com");

    m1.showInfo();
    System.out.println();

    m2.showInfo();
    System.out.println();

    m3.showInfo();

        
    }



    
}
