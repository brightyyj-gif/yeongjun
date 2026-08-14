package a0814;


interface Calculator{
    int sum(int a, int b); 
    //추상메소드 하나만 가지고 있습니다.
    //정수두개를 입력받아 정수하나만 반환
}

public class Ramda2 {
    public static void main(String[] args) {

// public int sum(int a, int b) {
//     return a + b;
// }  ==  (a, b) -> a + b; 동일 
   //원래는 int sum(int a, int b)  였지만 인터페이스에서 이미 int 자료형 정의 됨 (a, b) 로 축약(람다)
  /// ->  화살표는  입력을 받아 실행해라  
  // a + b 는 retrn a + b 같다. 

        //익명(이름이 없는) 클래스
        Calculator mc = (a, b) -> a + b;
        int result = mc.sum(3,4);
        System.out.println("result = " + result);
    }
}
