package javatestyyj.problem4_yyj;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println("'l' 개수: " + StringUtil.countChar("Hello", 'l'));
        System.out.println("뒤집기: " + StringUtil.reverseString("자바"));
        System.out.println("대문자: " + StringUtil.toUpperCase("hello"));
        System.out.println("대문자: " + StringUtil.toUpperCase("Java"));
        System.out.println("공백 제거: " + StringUtil.removeSpaces("Hello World"));
    }
}
