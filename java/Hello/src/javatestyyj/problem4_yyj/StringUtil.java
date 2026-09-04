package javatestyyj.problem4_yyj;

public class StringUtil {

    public static int countChar(String string, char c) {
       if(string == null){
        return 0;
       } 
       int count = 0;

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static String reverseString(String string) {
        if (string == null) {
        return null;
    }
    String result = "";
        for (int i = 0; i < string.length(); i++) {
        result = string.substring(i, i + 1) + result;
        }
        return result;
    }
    public static String toUpperCase(String string) {
        if (string == null) {
        return null;
    }
    return string.toUpperCase();
    }

    public static String removeSpaces(String string) {
        if (string == null) {
        return null;
    }
    String result = "";
    for (int i = 0; i < string.length(); i++) {
        if (string.charAt(i) != ' ') {
            result += string.charAt(i);
        }
    }
    return result;
}
}
