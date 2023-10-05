public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int ID;

    public Customer(String firstName, String lastName, String username, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Customer{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", username='" + username + '\'' + ", ID=" + ID + '}';
    }
}

