package a0728;

public class MethodEx11 {
    public static void main(String[] args) {
        int sum = total(90,80,70);
        System.out.println("총점 : " + sum);

        int result = add(99,100);
        System.out.println(result);
        
        System.out.println(isEven(10));
        System.out.println(isEven(7));

        int[] arr1 = {50,60,70,80,90,100};
        System.out.println(getMax(arr1));
        
        
        printMessage();
    }
    private static void printMessage() {
        int count = 10;
        String str = "text";
        for(int i = 1; i < 10; i++) {
            System.out.println(str);
        }

    }
  
        
    }
    private static int getMax(int[] arr1) {
        int max = arr1[0];
        for(int i = 1; i < arr1.length; i++){
            max = arr1[i];
        }
        return max;

    }
    //홀짝 메서드
    private static boolean isEven(int i) {
        if(i % 2 == 0){
            return true;
        } else{
            return false;
        }
    }
    // 두 정수의 합 메서드
    private static int add(int i, int j) {
        return i + j;

    }
    //총점 구하는 메서드
    private static int total(int i, int j, int k) {
        // int sum = 0;
        // sum = i + j + k;
        // return sum;
        return i + j + k;
    }
    
}
