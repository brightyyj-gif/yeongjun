package a0729.card1;

import javax.smartcardio.Card;

public class CardTest {
    public static void main(String[] args) {
        Card1 c1 = new Card1();
        
        c1.kind = "heart";
        c1.number = 7;
        System.out.println("== 카드1 ==");
        System.out.println("무늬 : " + c1.kind);
        System.out.println("숫자 : " + c1.number);
        // System.out.println("크기 : " + c1.width + " x " + c1.height);
        System.out.println("크기 : " + Card1.width + " x " + Card1.height);

        Card1 c2 = new Card1();

        c2.kind = "spade";
        c2.number = 4;

        System.out.println("== 카드2 ==");
        System.out.println("무늬 : " + c2.kind);
        System.out.println("숫자 : " + c2.number);
        // System.out.println("크기 : " + c2.width + " x " + c2.height);
        System.out.println("크기 : " + Card1.width + " x " + Card1.height);

        // 클래스 변수 변경
        Card1.width = 120;
        Card1.height = 300;
        System.out.println("== 카드 크기 변경 후 ==");
        System.out.println("카드1 : " + Card1.width + " x " + Card1.height);

    }
    
}
