package a0730.student1;

public class Student {
    
    public String name; //이름
    public int age; //나이 
    public String major; //전공
    public Student() {
        
    }

    //생성자 - 생성메서드
    //클래스이름 = 생성자이름이 같다
    //반환형이 없다. (void)

    public Student(String name, int age, String major) {
        //public은누 구나 접근가능 가능(폴더가 달라도 접근가능)
        public name = name;
        public this.age = age;
        public this.major = major;
    }

    // public Student(String n, int a, String m) {
    //     name = n;
    //     age = a;
    //     major = m;
    // }



    //정보 출력 메서드
    public void displayInfo() {
        System.out.println("학생 이름 : " + name);
        System.out.println("나이 : " + age + "세");
        System.out.println("전공 : " + major);
        System.out.println();
        
    }
}
