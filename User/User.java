public abstract class User {
    private String id;
    private String name;
    private String surname;
    private String username;
    private String password;
    private String email;
    private Address address;

    public User(String id, String name, String surname, String username, String password, String email, Address address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
    }
}
