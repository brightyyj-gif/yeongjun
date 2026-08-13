package a0811.movie;

import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieManager manager = new MovieManager();
        boolean flag = true;

        while (flag) {
            System.out.println("\n 영화 대여 시스템에 오신 것을 환영합니다.");
            System.out.println("1. 대여 가능한 영화 보기");
            System.out.println("2. 영화 대여하기");
            System.out.println("3. 대여한 영화 보기");
            System.out.println("4. 영화 추가하기");
            System.out.println("5. 영화 삭제하기");
            System.out.println("6. 영화 정보 수정하기");
            System.out.println("7. 영화 내용 보기");
            System.out.println("8. 종료");
            System.out.print("원하는 작업을 선택하세요 >>");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    manager.showAvailableMovies();
                    break;
                case 2:
                    System.out.print("대여할 영화 제목: ");
                    String rentTitle = sc.nextLine();
                    if (manager.rent(rentTitle)) {
                        System.out.println("영화가 성공적으로 대여되었습니다.");
                    } else {
                        System.out.println("영화가 없거나 대여 불가능합니다.");
                    }
                    break;
                case 3:
                    System.out.println("대여한 영화 목록");
                    manager.rent();
                    break;
                case 4:
                    System.out.print("추가 영화 제목: ");
                    String title = sc.nextLine();
                    System.out.print("감독: ");
                    String director = sc.nextLine();
                    System.out.print("장르: ");
                    String genre = sc.nextLine();
                    System.out.print("등급: ");
                    String rating = sc.nextLine();
                    manager.addMovie(title, director, genre, rating);
                    System.out.println("영화 추가 완료");
                    break;
                case 5:
                    System.out.print("삭제할 영화 제목: ");
                    manager.deleteMovie(sc.nextLine());
                    break;
                case 6:
                    System.out.print("수정할 영화 제목: ");
                    manager.updateMovie(sc.nextLine());
                    break;
                case 7:
                    System.out.print("조회할 영화 제목: ");
                    manager.showMovie(sc.nextLine());
                    break;
                case 8:
                    System.out.println("프로그램을 종료합니다.");
                    flag = false;
                    break;
                default:
                    System.out.println("1~8번 중에 입력하세요.");
            }
        }
        sc.close();
    }
}
