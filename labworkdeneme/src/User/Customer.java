public class Customer extends User {
    private String customerID;

    public Customer(String id, String name, String surname, String username, String password, String email, Address address, String customerID) {
        super(id, name, surname, username, password, email, address);
        this.customerID = customerID;
    }
}
