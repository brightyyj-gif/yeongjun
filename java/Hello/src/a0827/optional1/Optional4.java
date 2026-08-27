package a0827.optional1;

import java.util.Optional;

// 값이 없으면 예외 던지기 -> orElseThrow
public class Optional4 {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable("홍길동");

        opt.ifPresent(name -> System.out.println("환영합니다." + name + "님"));
    }
}
