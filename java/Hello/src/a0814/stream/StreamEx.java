package a0814.stream;

import java.util.Arrays;
import java.util.List;

// Java Stream은 Java8에서 추가된 기능
// 컬렉션(List, set, Map등)이나 배열의 데이터를 반복하면서 가공(필터링, 정렬, 변환, 집계)하기 위한 기능
//ex) for문을 더 쉽고 간결하게 작성하는 방법
public class StreamEx {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(90, 80, 70, 100, 95);

        for (Integer score : scores){
            System.out.println(scores);
        }
        System.out.println();
        scores.stream().forEach(score -> System.out.println());
    }
}

// List
//  │
//  ▼
// stream()
//  │
//  ▼
// 가공(filter, map, sorted...)
//  │
//  ▼
// 최종처리(forEach, collect, count...)
