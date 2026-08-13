package a0811.movie;

public class Movie {

    private String title;
    private String director;
    private String genre;
    private String rating;
    private boolean available;

    public Movie() {
    }

    public Movie(String title, String director, String genre, String rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.rating = rating;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void rent() {
        this.available = false;
    }

    @Override
    public String toString() {
        return "영화제목 : " + title + ", 감독=" + director + ", 장르=" + genre + ", 등급=" + rating
                + (available ? "대여가능" : "대여불가능");
    }
}
