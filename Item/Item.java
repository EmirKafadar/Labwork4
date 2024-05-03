public abstract class Item {
    private String itemID;
    private String title;
    private Date releaseDate;

    public Item(String itemID, String title, Date releaseDate) {
        this.itemID = itemID;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
