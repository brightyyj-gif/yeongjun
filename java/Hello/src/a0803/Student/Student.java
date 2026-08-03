package a0803.Student;

public class Student {
    public static Object getName;
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int total;
    private double avg;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        calc();
    }

    //총점, 평균
    public void calc() {
        total = kor + eng + math;
        avg = total / 3.0;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
        calc();
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
        calc();
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
        calc();
    }
    public void prinInfo() {
        System.out.printf("%-6s %3d %3d %3d %3d %6.2f\n",
            name, kor, eng, math, total, avg);
    }
    
    
    
}
