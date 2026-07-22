package a0721;

public class ScoreCalc {
    public static void main(String[] args) {
        int korean = 90;
        int english = 85;
        int math = 78;
        int totalScore = korean + english + math;
        double averageSocre = (double)(korean + english + math) / 3;
        System.out.println("국어: " + korean);
        System.out.println("영어: " + english);
        System.out.println("수학: " + math);
        System.out.println("총점: " + totalScore);
        System.out.println("평균: " + averageSocre);

        if(averageSocre >= 80) {
            System.out.println("합격");
        } else{
            System.out.println("불합격");
        }
    }
}
