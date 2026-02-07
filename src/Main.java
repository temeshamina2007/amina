public class Main {
    public static void main(String[] args) {

        Passenger p = new Passenger("Ali", "Khan", "KZ123");
        PassengerDAO.addPassenger(p);

        System.out.println("After INSERT:");
        PassengerDAO.getAllPassengers()
                .forEach(System.out::println);

        PassengerDAO.updateLastName("KZ123", "Updated");

        System.out.println("After UPDATE:");
        PassengerDAO.getAllPassengers()
                .forEach(System.out::println);

    }
}
