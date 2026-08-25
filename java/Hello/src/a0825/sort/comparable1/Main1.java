package a0825.sort.comparable1;

import java.util.ArrayList;
import java.util.Collections;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("홍길동", 20, 85));
        list.add(new Student("김철수", 22, 92));
        list.add(new Student("이영희", 21, 78));
        list.add(new Student("박민수", 20, 92));

        System.out.println("=== 정렬 전 ===");
        for (Student s : list) {
            System.out.println(s);
        }

        Collections.sort(list);

        System.out.println("=== 정렬 후 ===");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
