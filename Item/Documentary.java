public class Documentary extends Item {
    private String director;
    private String subject;

    public Documentary(String itemID, String title, Date releaseDate, String director, String subject) {
        super(itemID, title, releaseDate);
        this.director = director;
        this.subject = subject;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
