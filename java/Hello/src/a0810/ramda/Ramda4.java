package a0810.ramda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ramda4 {
    public static void main(String[] args) {
        // List<String> name = new ArrayList<>();
        //  name.add("apple");
        //  name.add("banana");
        //  name.add("orange");
        // for(int i = 0; i < name.size(); i++) {
        //     System.out.println(name.get(i));
        // }

        List<String> names = Arrays.asList("apple","banana","orange");
        System.out.println();
        for(String n :names){
            System.out.println(n);
        }
        System.out.println();

        //람다 foreach
        System.out.println("람다 foreach");
        names.forEach(name -> System.out.println(name));

        System.out.println("6글자 이상");
          for(int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if(name.length() >= 6){
                System.out.println(name);
            }
        }
        System.out.println("6글자 이상 2");
        for(String name : names){
            if (name.length() >= 6) {
                System.out.println(name);
                
            }
        }
        System.out.println("6글자 이상3");

        names.stream();
        .filter(name->name.length() >= 6);
        .foreach(System.out::println);


    }
}
