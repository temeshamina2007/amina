public class Passenger {
    private String firstName;
    private String lastName;

    private String passpord;

    public Passenger(String  firstName, String lastName, String passpord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passpord = passpord;
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getPasspord() {return passpord;}

    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setPasspord(String passpord) {this.passpord = passpord;}

    @Override
    public String toString() {
        return "Passenger{firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }
}