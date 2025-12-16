public class Passenger {
    private String firstName;
    private String lastName;
    private String passportNumber;

    public Passenger(String  firstName, String lastName, String passportNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public String getPassportNumber() {return passportNumber;}

    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setPassportNumber(String passportNumber) {this.passportNumber = this.passportNumber;}

    @Override
    public String toString() {
        return "Passenger{firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }
}