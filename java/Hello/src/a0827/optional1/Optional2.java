package a0827.optional1;

import java.util.Optional;

public class Optional2 {
// 값이 없을 때 기본값 처리
    // Java에서 null때문에 발생하는ㄴ 문제를 줄이기 위한 클래스
    public static void main(String[] args) {
        // null일 수도 있는 데이터를 감쌈
        String input = null;
        
        Optional<String> opt = Optional.ofNullable(input);
        // ofNullable() 값이 있으면 넣고, null이면 빈 Optional을 만듭니다.

        // 만약 값이 null이면 "기본 사용자"를 대신 반환
        String result = opt.orElse("기본 사용자");
        // optional에 값이 있으면 그 값을 사용하고, 없으면 "기본사용자"를 사용함
        System.out.println(result); // 출력: 기본 사용자
    }
}
