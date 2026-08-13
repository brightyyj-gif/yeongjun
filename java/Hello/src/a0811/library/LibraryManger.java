package a0811.library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManger {
    
    private ArrayList<Library> librarys; //Library 를 객체로 리스트로 만듦(변수)
    private ArrayList<Library> bookLocation; //Library 를 객체로 대여한 객체를 저장리스트 변수 

    public LibraryManger(){
        librarys = new ArrayList<>();
        bookLocation = new ArrayList<>();
        // Library library1 = new Library("this is java", "shin", "SectionA","979-11-691-229-8");
        // librarys.add(library1);
        librarys.add(new Library("this is java", "shin", "SectionA","979-11-691-229-8"));
        librarys.add(new Library("First React", "Lee Inje", "Section B", "979-11-6921-169-7"));
        librarys.add(new Library("Web Standards", "Ko Kyunghee", "Section C", "979-11-6303-622-7"));
        //더미데이터
    }

    public void allLibrary() {
       System.out.println("대출가능한 도서보기");
       for(int i = 0; i < librarys.size();i++){
        Library library = librarys.get(i);
        if(library.isAvailable()){//true 저장되어있는것만
            System.out.println(library);
        }
       }
    }

    public boolean bookLocations(String libraryName) {
       for(Library library:librarys){ //librarys라는 리스트를 돌면서 한개 객체를 library로 옮김
            if(library.getTitle().equalsIgnoreCase(libraryName) && library.isAvailable()){
                //library에서 title목록과 키보드로 입력한 libraryName 비교 그리고 대출가능 true
                library.book(); //대출처리 isAvailable =false 
                bookLocation.add(library); //대출된 도서목록 bookLocation(arrayList) 추가
                return true;
            }
       }
       return false;
    }

    public void bookLocations() {
    //   System.out.println("대출한 도서보기");
      for(Library location:bookLocation){
         System.out.println(location);
      }
    }

    public void addLibrary(String newTitle, String newAuthor, String newLocation, String newIsbn) {
    //   Library library = new Library(newTitle,newAuthor,newLocation,newIsbn);
    //   librarys.add(library);
     librarys.add(new Library(newTitle, newAuthor, newLocation, newIsbn)); 
    }

    public void delLibrary(String dname) {
        boolean result = false;
        for(Library library : librarys){
            if(library.getTitle().equalsIgnoreCase(dname)){
                if(library.isAvailable()){//현재 대여중이 아닐때
                    librarys.remove(library);
                    result = true;
                    break;
                }else{
                    result = false;
                    break;
                }
            }
        }
        if(result){
            System.out.println("삭제됨");
        }else{
            System.out.println("삭제안됨");
        }

    }

    public void updateLibrary(String uname) {
       Scanner sc = new Scanner(System.in);
       boolean found = false;
       for(Library a :librarys){
        if(a.getTitle().equalsIgnoreCase(uname)){
            System.out.print("뭘 수정할건데?\n" + "1. 도서이름\t 2.도서저자\t 3. 도서위치\t 4.도서 ISBN\n >>");
            int menu = sc.nextInt();
            sc.nextLine(); // 버퍼 제거
            switch (menu) {
                case 1:
                    System.out.print("수정할 이름");
                    a.setTitle(sc.nextLine()); //키보드로 입력하여 도서이름 수정
                    break;
                case 2:
                    System.out.print("수정할 저자: ");
                    a.setAuthor(sc.nextLine());
                    break;
                case 3:
                    System.out.print("수정할 위치: ");
                    a.setLocation(sc.nextLine());
                    break;
                case 4:
                    System.out.print("수정할 ISBN: ");
                    a.setIsbn(sc.nextLine());
                    break;
                default:
                    System.out.println("1~4번 중에 입력하세요");
                    return;
            }
            found = true;
            break; //찾았으면 반복종료
        }
       } 
       if(!found){
        System.out.println("찾는 도서가 없어서 업데이트 할 수 없습니다.");
       }

    }

    public void showLibrary(String sname) {
        for(Library library:librarys){
            if(library.getTitle().equalsIgnoreCase(sname)){
                System.out.println(library);
            }
        }
    }



}
