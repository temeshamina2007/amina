import java.util.Objects;

public class Passenger extends Person {
    private String passportNumber;

    public Passenger(String firstName, String lastName, String passportNumber) {
        super(firstName, lastName);
        this.passportNumber = passportNumber;
    }

    public String getPassportNumber() { return passportNumber; }
    public void setPassportNumber(String passportNumber) { this.passportNumber = passportNumber; }

    @Override
    public String getRole() {
        return "Passenger";
    }

    @Override
    public String toString() {
        return "Passenger{firstName='" + getFirstName() +
                "', lastName='" + getLastName() +
                "', passport='" + passportNumber + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passenger)) return false;
        Passenger that = (Passenger) o;
        return passportNumber.equals(that.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }
}
