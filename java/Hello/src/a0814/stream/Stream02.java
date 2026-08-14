package a0814.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream02 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        //filter는 필요한 데이터만 선택
        //map은 원하는 형태로 변환(데이터변환)
        List<Integer> squares = numbers.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());
                System.out.println(squares);
            System.out.println();
       
}
}