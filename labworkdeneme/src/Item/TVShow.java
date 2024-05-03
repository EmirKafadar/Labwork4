public class TVShow extends Item {
    private int season;
    private int episode;
    private String producer;

    public TVShow(String itemID, String title, Date releaseDate, int season, int episode, String producer) {
        super(itemID, title, releaseDate);
        this.season = season;
        this.episode = episode;
        this.producer = producer;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
