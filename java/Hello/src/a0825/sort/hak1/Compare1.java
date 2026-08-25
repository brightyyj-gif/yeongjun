package a0825.sort.hak1;

public class Compare1 {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        String str3 = "apple";
        //compareTo - 두 문자열을 사전식으로 비교
        // 문자열을 앞에서부터 한글자씩 비교
        System.out.println(str1.compareTo(str2));
        // 아스키코드로 비교 했을 때 a(97)가 b(98)보다 작아서 음수  -1
        System.out.println(str1.compareTo(str3));
        // 아스키코드로 비교 했을 때 같은 값이므로 0
        System.out.println(str2.compareTo(str1));
        // 아스키코드로 비교 했을 때 b가 a보다 크므로 양수
    }
}
