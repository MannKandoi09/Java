//Track movie bookings by storing movie names and seat counts.

import java.util.ArrayList;
import java.util.List;

class Movie{
    String name;
    int availableSeats;

    public Movie(String name, int availableSeats) {
        this.name = name;
        this.availableSeats = availableSeats;
    }

    void bookTicket(int seats){
        if (availableSeats >= seats){
            availableSeats -= seats;
            System.out.println("SuccessFully Booked..." + seats + " seats for: " + name);
        }else {
            System.out.println("No Seats Available for Movie: " + name);
        }

    }
}
public class MovieTicketBooking {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Avengers Endgame", 50));
        movies.add(new Movie("Pushpa", 25));

        movies.get(0).bookTicket(40);

        for (Movie m : movies){
            System.out.println("Movie: " + m.name + " Available Seats: " + m.availableSeats);
        }
    }

}
