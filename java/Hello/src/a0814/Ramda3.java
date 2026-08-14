package a0814;


interface Calculator{
    int sum(int a, int b); 
}

public class Ramda3 {
    public static void main(String[] args) {

        Calculator mc = Integer::sum;
        //Integer::sum 이미 만들어진 메서드 (sum)-합계을 이름으로 연결 - 메서드 참조
        //Integer::max 큰수(최대값)
        //Integer::min 작은수(최소값)
        int result = mc.sum(3,4);
        System.out.println("result = " + result);
    }
}
