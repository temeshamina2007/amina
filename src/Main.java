public class Main{
    public static void main(String[] args) {

        Passenger p1=new Passenger("Amina", "Temesh", "05794049574303");
        Flight f1=new Flight("950858858", "Astana", "Almaty", "21:00", "23:00", 40, 0);
        Reservation r1=new Reservation("2094694", p1, f1, 50000.00);
        System.out.println(p1);
        System.out.println(f1);
        System.out.println(r1);

    }
}
