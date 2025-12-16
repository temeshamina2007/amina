public class Flight {
    private String flightNumber;
    private String from;
    private String to;
    private String fromTime;
    private String toTime;
    private int allSeats;
    private int bookedSeats;

    public Flight (String flightNumber,String from,String to,String fromTime,String toTime,int allSeats, int bookedSeats){
        this.flightNumber=flightNumber;
        this.from=from;
        this.to=to;
        this.fromTime=fromTime;
        this.toTime=toTime;
        this.allSeats=allSeats;
        this.bookedSeats=0;

    }

    public String getFlightNumber() {return flightNumber;}

    public String getFrom() {
        return from;
    }

    public String getFromTime() {
        return fromTime;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public int getAllSeats() {
        return allSeats;
    }

    public String getTo() {
        return to;
    }

    public String getToTime() {
        return toTime;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setAllSeats(int allSeats) {
        this.allSeats = allSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }


    public int getAvailable(){return allSeats - bookedSeats;}

    public boolean bookOneSeat (){
        if (getAvailable()>0){
            bookedSeats++;
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
      return "Flight{flightNumber='" + flightNumber
                + "', from='" + from
                + "', to='" + to
                + "', totalSeats=" + allSeats
                + ", bookedSeats=" + bookedSeats
                + ", availableSeats=" + getAvailable()
                + "}";
    }
}