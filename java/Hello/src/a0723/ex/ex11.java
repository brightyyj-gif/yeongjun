package a0723.ex;

public class ex11 {
    public static void main(String[] args) {
        int second = 3670;
        int hour = second / 3670;
        int minute = second / 60;
        int sec = second % 60;

        System.out.println(hour + "시간");
        System.out.println(minute + "분");
        System.out.println(sec + "초");
    }
    
}
