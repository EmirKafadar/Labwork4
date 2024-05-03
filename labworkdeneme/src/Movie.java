public class Movie extends Item {
    private String director;
    private String genre;

    public Movie(String itemID, String title, Date releaseDate, String director, String genre) {
        super(itemID, title, releaseDate);
        this.director = director;
        this.genre = genre;
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
}
