public class StringBuffer1 {
    
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("  Java"); //문자추가 append
        sb.append("!"); 

        System.out.println(sb); // 출력: Hello Java!

        StringBuffer sb1 = new StringBuffer("Hello World");
        sb1.insert(5, ", Java"); //인덱스 5번 위치에 삽입
        
        System.out.println(sb1); // 출력: Hello, Java World

        StringBuffer sb2 = new StringBuffer("Hello Java World");
        sb2.replace(7, 11, "Python"); // 인덱스 7부터 11 직전까지 교체

        System.out.println(sb2); // 출력: Hello, Python World

        StringBuffer sb3 = new StringBuffer("Hello, Python World");
        sb3.delete(5, 13); // ", Python" 삭제

        System.out.println(sb3); // 출력: Hello World
    }
}
