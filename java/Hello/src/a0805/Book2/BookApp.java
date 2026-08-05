package a0805.Book2;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        //더미 데이터
        list.add(new Book("자바의 정석", "남궁성"));
        list.add(new Book("혼자 공부하는 자바", "신용권"));
        list.add(new Book("이것이 자바다", "신용권"));
        while (run) {
            System.out.println("------------------------");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 검색");
            System.out.println("3. 도서 수정");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 전체 출력");
            System.out.println("6. 종료");
            System.out.print("선택 > ");
            
            int menu;
            try {
                menu = Integer.parseInt(sc.nextLine()); //문자 1, 2, 3으로 입력받아 숫자로 변환
            }catch (Exception e) { //예외발생 (a 라는 문자입력
                System.out.println("숫자를 입력하세요");
                continue; //while문으로 다시 선택할 수 있게 해준다.
            }

            switch (menu) {
                case 1: //등록
                    System.out.println("제목 입력");
                    String title = sc.nextLine();
                    
                    System.out.println("저자 입력");
                    String author = sc.nextLine();
                    list.add(new Book(title, author)); //생성
                    break;
                case 2:
                    System.out.println("검색할 제목 입력");
                    title = sc.nextLine();
                    Book b = findBook(list, title);
                    if(b != null) {
                        System.out.println(b);
                    }else {
                        System.out.println("도서가 없습니다");
                    }
                    break;
                case 3:
                    System.out.println("수정할 제목");
                    title = sc.nextLine();

                    System.out.println("새 저자 입력");
                    author = sc.nextLine();

                    if(updateBook(list, title, author)){
                        System.out.println("수정완료");
                    } else{
                        System.out.println();
                    }
                    break;
                    case 4: // 삭제
                        System.out.println("삭제할 제목");
                        title = sc.nextLine();

                        if(deleteBook(list, title)){
                            System.out.println("삭제완료");
                        } else {
                            System.out.println("삭제할 도서가 없습니다.");
                        }
                        break;
                case 5: //조회(전체출력)
                    if(list.isEmpty()){
                        System.out.println("등록된 도서가 없습니다.");
                    }else{
                        for(Book book : list){
                            System.out.println(book);
                            //
                        }
                    }
                    break;
                case 6: //종료
                run = false;
                System.out.println("프로그램 종료");
                break;


                default:
                    break;
            }
        }
    }
    //저자만 수정
    private static boolean updateBook(ArrayList<Book> list, String title, String newAuthor) {
       for(Book b : list){
         if(b.getTitle().equals(title)){//타이틀제목이 같으면
            b.setAuthor(newAuthor); //새책이름으로 책제목만 수정
            return true;
         }
       }
       return false;
    }
    

    private static Book findBook(ArrayList<Book> list, String title) {
        for(Book b : list) {
            if (b.getTitle().equals(title)) {
                return b;
            }
        }
        return null;
    }
    private static boolean deleteBook(ArrayList<Book> list, String title) {
       //삭제시 인덱스 번호

       for(int i=0; i < list.size();i++){
            if(list.get(i).getTitle().equals(title)){
                list.remove(i);
                return true;
            }
       }
       return false;

    }
}
