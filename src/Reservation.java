public class Reservation {
    private String bookId;
    private Passenger passenger;
    private Flight flight;
    private double price;

    public Reservation( String bookId, Passenger passenger, Flight flight, double price){
        this.bookId=bookId;
        this.passenger=passenger;
        this.flight=flight;
        this.price=price;
    }
    public String getBookId(){return bookId;}
    public Passenger getPassenger(){return passenger;}
    public Flight getFlight(){return flight;}
    public double getPrice(){return price;}

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public boolean confirm(){
        return flight.bookOneSeat();
    }
    @Override
    public String toString() {
        return "Booking{bookingId='" + bookId
                + "', passenger=" + passenger
                + ", flight=" + flight.getFlightNumber()
                + "', price=" + price
                + "}";
    }
}