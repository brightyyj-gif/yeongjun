public class String1 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); //true
        String str3 = new String("Java"); 
        // 객체를 만들면 주소가 달라짐
        System.out.println(str1 == str3); // ==으로 비교하면 주소끼리 비교
        System.out.println(str1.equals(str3)); // 내용끼리 비교 / 문자열을 비교할땐 .equals를 주로 활용
    }
}
