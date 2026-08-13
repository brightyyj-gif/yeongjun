package a0811.movie;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieManager {

    private ArrayList<Movie> movies;
    private ArrayList<Movie> rentedList;

    public MovieManager() {
        movies = new ArrayList<>();
        rentedList = new ArrayList<>();
        movies.add(new Movie("Inception", "Nolan", "SF", "12"));
        movies.add(new Movie("Parasite", "Bong", "Drama", "15"));
        movies.add(new Movie("Toy Story", "Lasseter", "Animation", "All"));
    }

    public void showAvailableMovies() {
        System.out.println("대여 가능한 영화");
        for (Movie movie : movies) {
            if (movie.isAvailable()) {
                System.out.println(movie);
            }
        }
    }

    public boolean rent(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title) && movie.isAvailable()) {
                movie.rent();
                rentedList.add(movie);
                return true;
            }
        }
        return false;
    }

    public void rent() {
        for (Movie movie : rentedList) {
            System.out.println(movie);
        }
    }

    public void addMovie(String title, String director, String genre, String rating) {
        movies.add(new Movie(title, director, genre, rating));
    }

    public void deleteMovie(String title) {
        boolean result = false;
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                if (movie.isAvailable()) {
                    movies.remove(movie);
                    result = true;
                }
                break;
            }
        }
        System.out.println(result ? "삭제됨" : "삭제안됨");
    }

    public void updateMovie(String title) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                System.out.print("수정 항목\n1. 제목\t2. 감독\t3. 장르\t4. 등급\n >>");
                int menu = sc.nextInt();
                sc.nextLine();
                switch (menu) {
                    case 1:
                        System.out.print("수정할 제목: ");
                        movie.setTitle(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("수정할 감독: ");
                        movie.setDirector(sc.nextLine());
                        break;
                    case 3:
                        System.out.print("수정할 장르: ");
                        movie.setGenre(sc.nextLine());
                        break;
                    case 4:
                        System.out.print("수정할 등급: ");
                        movie.setRating(sc.nextLine());
                        break;
                    default:
                        System.out.println("1~4번 중에 입력하세요");
                        return;
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("찾는 영화가 없어서 수정할 수 없습니다.");
        }
    }

    public void showMovie(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                System.out.println(movie);
            }
        }
    }
}
