package a0805.array;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        
        //선언
        ArrayList<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("이순신");
        list.add("김유신");

        for(String name :list){
            System.out.println(name);
        }
        System.out.println();
        System.out.println(list.size()); //ArrayList갯수
        System.out.println();
        System.out.println(list.get(0));

        System.out.println();
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("=== 수정 ===");
        System.out.println();
        list.set(1, "강감찬");

        
        for(String name :list){
            System.out.println(name);
        }
        System.out.println("=== 삭제 ===");
        list.remove(1);
        for(String name : list){
            System.out.println(name);
        }
    }
}
