package Task1;

public class Customer {

    private String firstName;
    private String lastName;
    private String username;
    private final int id = counter;
    private static int counter = 1;

    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;

        counter += 1;
    }

    @Override
    public String toString() {
        String s = "FirstName = " + firstName + "   " +
                "|    LastName = " + lastName + "   " +
                "|    Username = " + username + "   " +
                "|    ID = " + id;
        return s;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}


