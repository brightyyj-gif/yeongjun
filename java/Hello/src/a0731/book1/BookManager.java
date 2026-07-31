package a0731.book1;

import java.util.Scanner;

public class BookManager {
    //최대 100권의 도서를 저장할 수 있는 배열과 카운터 변수
    static Book[] bookList = new Book[100];
    static int bookCount = 0; //등록된 도서 수 (도서의 번호 역할 활용가능)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

       while(run) {
        printMenu();
        int choice = scanner.nextInt(); //번호입력
        scanner.nextLine(); //enter 제거 넥스트인트 밑에 써주기
        switch (choice) {
            case 1:
                createBook(scanner); //도서등록
                break;

            case 2:
                readBook(); //도서 목록
                break;

            case 3:
                updateBook(scanner);
                break;

            case 5:
                System.out.println("프로그램 종료");
                run = false;
                break;
        
            default:
                break;
        }
       }
    }

    private static void updateBook(Scanner scanner) {
        System.out.println("\n--- [도서 정보 수정] ---");
        readBook();
        if (bookCount == 0) return;
        System.out.print("수정할 도서의 관리번호 입력: ");
        int targetNo = scanner.nextInt();

        // 관리번호로 배열에서 해당 도서 찾기 (번호는 1부터 시작하므로 index는 targetNo - 1)
        int index = findBookIndexByNo(targetNo);
        if(index == -1) {
            System.out.println("결과 : 일치하는 관리번호의 도서가 없습니다.");
            return;
        }
        System.out.println("현재 선택된 도서: " + bookList[index].getTitle() + " (" + bookList[index].getAuthor() + ")");
        scanner.nextLine();
        System.out.print("새로운 제목: ");
        String newTitle = scanner.nextLine();
        
        System.out.print("새로운 저자: ");
        String newAuthor = scanner.nextLine();
        
        System.out.print("새로운 가격: ");
        int newPrice = scanner.nextInt();
        scanner.nextInt();
        
        bookList[index].setTitle(newTitle);
        bookList[index].setAuthor(newAuthor);
        bookList[index].setPrice(newPrice);

        System.out.println("결과: 도서 정보가 성공적으로 수정되었습니다.\n");
    }

    private static int findBookIndexByNo(int no) {
        for(int i = 0; i < bookCount; i++) {
            if(bookList[i].getNo() == no) {
                return i; //찾으면 인덱스 번호 받아
            }
        }
        return -1; //못찾으면 -1번 반환
    }

    private static void readBook() {
        System.out.println("\n--- [전체 도서 목록] ---");
        if (bookCount == 0) {
            System.out.println("등록된 도서가 없습니다.\n");
            return;
        }
        for(int i = 0; i < bookCount; i++) {
            Book b = bookList[i];
            System.out.printf("관리번호: %d | 제목: %s | 저자: %s | 가격: %,d원\n",
                b.getNo(), b.getTitle(), b.getAuthor(), b.getPrice()
            );
        }
        System.out.println();
    }

    // 도서등록
    private static void createBook(Scanner scanner) {
        System.out.println("\n--- [도서 등록] ---");
        if(bookCount >= 100) {
            System.out.println("더이상 도서등록 할 수없음");
            return; //if문을 빠져나가는 리턴
        }

        int no = bookCount + 1; // 자동 번호 부여
        System.out.print("책 제목: ");
        String title = scanner.nextLine(); //한줄입력
        
        System.out.print("저자: ");
        String author = scanner.nextLine();
        
        System.out.print("가격: ");
        int price = scanner.nextInt();
        //nextInt가 숫자만 가져가곡 enter(\n)는 버퍼에 남겨두기 때문에
        scanner.nextLine(); //enter 제거

        //Book 객체 생성 후 배열에 저장
        bookList[bookCount] = new Book(no, title, author, price);
        bookCount++;
        System.out.println("성공" + title + "도서등록(관리번호" + no + ")");

    }
    private static void printMenu() {
        System.out.println("==================================================");
        System.out.println(" 1. 도서등록(C) | 2. 도서조회(R) | 3. 도서수정(U) | 4. 도서삭제(D) | 5. 종료 ");
        System.out.println("==================================================");
        System.out.print("선택> ");
    }
    
}
