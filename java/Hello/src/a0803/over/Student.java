package a0803.over;

class Student {
    public String name;
    private int age;

    public Student() {
        System.out.println("기본 생성자");
    }
    
    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
}
