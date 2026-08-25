package a0825.sort.cpt;

public class Student {
    String name;
    int age;
    int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + "(나이:" + age + ", 점수:" + score + ")";
    }
}
