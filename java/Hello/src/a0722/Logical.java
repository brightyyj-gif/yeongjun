package a0722;

public class Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("=== 논리 연산자===");
        System.out.println("a = " + a + ", b = " + b);

        //AND 연산(&&) 둘 다 참 일 때만
        System.out.println("\n AND 연산 (&&)");
        System.out.println("a && a" + (a && a));
        System.out.println("a && b" + (a && b));
        System.out.println("b && a" + (b && a));
        System.out.println("b && b" + (b && b));

        //OR 연산(||) 둘 중 하나라도 참 일 때
        System.out.println("\n OR 연산 (||)");
        System.out.println("a || a" + (a || a));
        System.out.println("a || b" + (a || b));
        System.out.println("b || a" + (b || a));
        System.out.println("b || b" + (b || b));

        //NOT 연산(!)
        System.out.println("\n NOT 연산 (!)");
        System.out.println("!a: " + (!a));
        System.out.println("!b: " + (!b));

        System.out.println("\n=== 복합 논리 연산자 ===");
        boolean x = true;
        boolean y = true;
        boolean z = false;

        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        System.out.println("x && y && z : " + (x && y && z ));
        System.out.println("x || y || z : " + (x || y || z ));
        System.out.println("(x && y) || z: " + ((x && y) || z));
        System.out.println("x && (y || z): " + (x && (y || z)));

        //실전예제 1
        // 3, 4, 5 봄   6, 7, 8 여름   9, 10, 11 가을   12, 1, 2 겨울

        int season = 1;
         if(season >= 3 && season <= 5) {
            System.out.println("봄 입니다.");
         } else if(season >= 6 && season <= 8) {
            System.out.println("여름");
         } else if(season >= 9 && season < 11) {
            System.out.println("가을");
         } else if(season == 12 || season == 1 || season ==2) {
            System.out.println("겨울");
         } else{
            System.out.println("입력이 잘못되었습니다.");
         }

         //실전 문제 2
         //복합 논리 연산 윤년 조건식
         int year = 2026;
         //조건1 : (4 로 나누어 떨어지고) AND 
         //(100으로 나누어 떨어지지 않음) -> 나머지가 0이 아닌
         //조건2 : OR (400으로 나누어 떨어짐)

    }
}
