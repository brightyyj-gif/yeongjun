public class String2 {
    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println(str.length()); // 10 - 문자의 길이
        System.out.println(str.charAt(6)); // J 특정문자의 위치 인덱스번호

        String str1 = "Java";
        String str2 = "JAVA";

        System.out.println(str1.equals(str2)); // false대소문자구분
        System.out.println(str1.equalsIgnoreCase(str2)); //true 대소문자 무시

        // 문자열 검색 및 포함 여부
        String str3 = "Programmer";
        System.out.println(str3.indexOf("gram"));
        System.out.println(str3.contains("pro")); //대소문자 구분
        System.out.println(str3.contains("Prog"));

        // 문자열 추출
        String str4 = "HelloWorld";
        System.out.println(str4.substring(5)); // World
        // 인덱스 번호 5번부터 끝까지 추출
        System.out.println(str4.substring(0, 5)); // Hello
        // 0부터 5번 전까지

        System.out.println();
        String str5 = "  Hello Java  ";

        System.out.println(str5.replace("Java", "World"));
        System.out.println(str5.toLowerCase());
        System.out.println(str5.toUpperCase());
        System.out.println(str5.trim()); // 앞뒤 공백제거

        System.out.println();
        // split예제
        String fruits = "사과,바나나,포도";
        String[] arr = fruits.split(",");
        System.out.println(arr[1]);

        // join 예제
        String joined = String.join("-", "2026", "08", "07");
        System.out.println(joined);
    }
}
