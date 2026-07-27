package a0727;

public class Do_While1 {
    public static void main(String[] args) {
        int i = 1; //초기값

        do{

            System.out.println(i);

            i++;
        }
        while(i <= 0); //조건식 틀려도 한 번은 무조건 실행

    }
}
