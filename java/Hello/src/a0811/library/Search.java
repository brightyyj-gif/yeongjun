package a0811.library;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryManger manger = new LibraryManger();
        //생성과 동시에 더미데이터 3개도 생성메서드에 있기 때문데 생성됨
        boolean flag = true;
        while (flag) {
            System.out.println("\n 도서검색 시스템에 오신 것을 환영합니다.");
            System.out.println("1.대출 가능한 도서 보기");
            System.out.println("2.도서 대출하기");
            System.out.println("3.대출한 도서 보기");
            System.out.println("4.도서 추가하기");
            System.out.println("5.도서 삭제하기");
            System.out.println("6.도서 정보 수정하기");
            System.out.println("7.도서 내용 보기");
            System.out.println("8.종료");
            System.out.print("원하는 작업을 선택하세요 >>");
            int choice = sc.nextInt();
            sc.nextLine(); // 초기화

            switch (choice) {
                case 1:
                    System.out.println("대출 가능한 도서");
                     manger.allLibrary();
                    //대출 상태가 아닌 책들만 출력
                    break;
                case 2:
                    System.out.println("도서 대출 하기");
                    System.out.print("대출 하려는 도서 이름 입력 : ");
                    String libraryName = sc.nextLine(); //도서명입력
                    if(manger.bookLocations(libraryName)){
                        System.out.println("도서가 성공적으로 대출되었습니다.");
                    }else{
                        System.out.println("도서가 존재하지 않거나 대출 불가능");
                    }
                    break;
                 case 3:
                    System.out.println("대출한 도서보기");
                    manger.bookLocations(); //메서드 명은 같으나 매개변수가 없으므로 메소드 오버로딩
                    
                    break; 
                 case 4:
                    System.out.println("도서추가하기");
                    //도서이름 저자 위치 ISbn - 함수 도서리스트에 add 
                    System.out.print("추가 도서이름 : ");
                    String newTitle = sc.nextLine();
                     System.out.print("추가 도서저자 : ");
                    String newAuthor = sc.nextLine();
                     System.out.print("도서 위치 : ");
                    String newLocation = sc.nextLine();
                     System.out.print("도서 ISBN : ");
                    String newIsbn = sc.nextLine();
                    manger.addLibrary(newTitle,newAuthor,newLocation,newIsbn);
                    System.out.println("도서 추가 완료");
                    break; 
                case 5:
                    System.out.println("삭제시작");
                    System.out.print("삭제 도서 이름 입력 : ");
                    String dname = sc.nextLine();
                    if(dname.equals("")){
                        System.out.println("삭제 하려는 도서 다시 입력");
                        dname = sc.nextLine();
                    }
                    manger.delLibrary(dname);
                    System.out.println("삭제완료");
                    //대출 상태가 아닌 책들만 출력
                    break;
                 case 6:
                    System.out.println("수정시작");
                    System.out.print("수정할 도서 이름 입력 : ");
                    String uname = sc.nextLine();
                    if(uname.equals("")){
                        System.out.println("수정 하려는 도서 다시 입력");
                        uname = sc.nextLine();
                    } 
                    manger.updateLibrary(uname);
                    System.out.println("수정 완료");
                    break;
                case 7:
                    System.out.println("조회시작 \n 도서이름입력");
                    String sname = sc.nextLine();
                    if(sname.equals("")){
                        System.out.println("조회 하려는 도서 다시 입력");
                        uname = sc.nextLine();
                    } 
                    manger.showLibrary(sname)
                    System.out.println("조회 완료");
                    break;       

                case 8:
                    System.out.println("프로그램 종료합니다.");
                    flag = false;
                    break;    
                default:
                    break;
            }

        }

    }
}
