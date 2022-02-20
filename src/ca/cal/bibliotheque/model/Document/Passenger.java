package ca.cal.bibliotheque.model.Document;

public class Passenger {
    private final long id;
    private final String firstName;
    private final String lastName;

    public Passenger(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", lastName='" + firstName + '\'' +
                ", firstName='" + lastName + '\'' +
                '}';
    }
}
