public class Employee extends User {
    private String employeeID;

    public Employee(String id, String name, String surname, String username, String password, String email, Address address, String employeeID) {
        super(id, name, surname, username, password, email, address);
        this.employeeID = employeeID;
    }
}
