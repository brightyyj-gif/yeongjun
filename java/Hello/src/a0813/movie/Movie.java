package a0813.movie;

public class Movie {
    private String title; //영화제목
    private String director; //감독
    private int year; //개봉연도

    public Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }
    
}
