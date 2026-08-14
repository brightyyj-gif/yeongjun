package a0814.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream04 {
    public static void main(String[] args) {
                // 중첩 리스트를 평탄화
        List<List<Integer>> nestedList = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );
        System.out.println(nestedList);

        List<Integer> flatList = nestedList.stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());
            System.out.println(flatList);
        // 결과: [1, 2, 3, 4, 5, 6, 7, 8, 9]

        // 문자열을 문자로 분리
        List<String> words = Arrays.asList("Hello", "World");
        List<String> letters = words.stream()
            .flatMap(word -> Arrays.stream(word.split("")))
            .collect(Collectors.toList());
            System.out.println(letters);
        // 결과: ["H", "e", "l", "l", "o", "W", "o", "r", "l", "d"]

        //중복제거
        List<Integer> numbers = Arrays.asList(4, 2, 2, 3, 3, 3, 1);
        List<Integer> unique = numbers.stream()
        .distinct()
        //.sorted()
        .sorted(Comparator.reverseOrder()) //내림차순
        .toList();
        System.out.println("중복제거" + unique);

        // 문자열 중복 제거
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Charlie");
        List<String> uniqueNames = names.stream()
        .distinct()
        .collect(Collectors.toList());
        System.out.println(uniqueNames);
        // 결과: ["Alice", "Bob", "Charlie"]

        // 문자열 중복 제거
        List<String> names1 = Arrays.asList("Alice", "Bob", "Alice", "Charlie");
        List<String> uniqueNames1 = names.stream()
        .distinct()
        .sorted(Comparator.comparing(String::length))
        .collect(Collectors.toList());
        System.out.println("커스텀 정렬" + uniqueNames1);
        // 결과: ["Alice", "Bob", "Charlie"]

        // 처음 3개만 가져오기
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> firstThree1 = numbers1.stream()
        .limit(3)
        .collect(Collectors.toList());
        System.out.println("3개만 가져오기" + firstThree1);


        List<String> names2 = Arrays.asList("alice", "Bob", "Charlie");
        long count = names2.stream()
        .count();
        System.out.println(count);

        //조건을 만족하는 요소 개수
        long longNames = names2.stream()
        .filter(name -> name.length() > 4)
        .count();
        System.out.println(longNames);
    }
}
