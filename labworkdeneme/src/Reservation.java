public class Reservation {
    private String reservationID;
    private Date date;
    private Customer customer;
    private List<Item> items;

    public Reservation(String reservationID, Date date, Customer customer, List<Item> items) {
        this.reservationID = reservationID;
        this.date = date;
        this.customer = customer;
        this.items = items;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
