import java.util.ArrayList;
import java.util.List;

//Store passenger name, bus number, and seat.
class passengers{
    String name;
    String busNo;
    int seats;

    public passengers(String name, String busNo, int seats) {
        this.name = name;
        this.busNo = busNo;
        this.seats = seats;
    }
}
public class BusReservation {
    public static void main(String[] args) {
        List<passengers> pass = new ArrayList<>();
        pass.add(new passengers("Mann", "Bus101", 2));
        pass.add(new passengers("Hari", "Bus101", 12));

        for (passengers p : pass){
            System.out.println("Name: " + p.name + " Has Booked Ticket In Bus: " + p.busNo + " Booked Seats: " +p.seats);
        }

    }
}
