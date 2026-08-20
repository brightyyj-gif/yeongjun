package a0820;

public class Main1 {
    public static void main(String[] args) {
        
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        s1.print();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
