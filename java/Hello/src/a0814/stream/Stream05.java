package a0814.stream;

import java.util.Arrays;
import java.util.List;

public class Stream05 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
        .reduce(0, (a,b) -> a + b);// 초기값, (누적값,가져온값)
        System.out.println(sum);

        System.out.println();
        int max = numbers.stream()
        .reduce(Integer.MIN_VALUE, Integer::max);
        //MIN_VALUE 정수로서 가장 작은 값: -21억
        System.out.println(max);
        

        //문자열 연결
        System.out.println();
        List<String> words = Arrays.asList("Hello", "World", "Java");
        String combined = words.stream()
        .reduce("", (a, b) -> a + " " + b);
        System.out.println(combined);
    }
}
 //0 초기값 
     //a : 지금까지 누적값
     //b : 스트림에서 가져온값
    //      초기값 = 0
    // 0 + 1 = 1
    // 1 + 2 = 3
    // 3 + 3 = 6
    // 6 + 4 = 10
    // 10 + 5 = 15   
    // 결과: 15