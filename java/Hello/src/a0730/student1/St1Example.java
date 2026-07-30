package a0730.student1;


public class St1Example {
    public static void main(String[] args) {
        
        // 생성자란? 객체가 생성될 때 자동으로 실행되는 특별한 메서드
        // 객체를 만들면서 초기값을 넣을 수 있다.
        Student student1 = new Student("문동은", 20, "컴퓨터공학과");
        Student student2 = new Student("이석현", 22, "수학과");
        Student student3 = new Student("임동식", 21, "부동산학과");

        //생성한 객체의 정보를 출력
        System.out.println("=== 학생 정보 ===");
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
        student4.name = "홍길동";
        student4.age = 25;
        student4.major = "국어국문";




        //Student student1 = new Student();
        //개체를 만든다. 인스턴스를 만든다.
        //student1.name = "홍길동";
        //student1.age = 30;
        //student1.major = "국어국문학";
    }
    
    
}
