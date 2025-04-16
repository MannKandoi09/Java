//Requirements:
//Interface Bookable: method book()
//Classes: MiniCab, SUV, LuxuryCab
//Each implements book() differently

interface Bookable{
    void book();
}

class miniCab implements Bookable{

    @Override
    public void book() {
        System.out.println("Mini Cab Booked. $10/perKm!");
    }
}

class suv implements Bookable{

    @Override
    public void book() {
        System.out.println("SUV Booked. $15/perKm!");
    }
}

class luxuaryCar implements Bookable{

    @Override
    public void book() {
        System.out.println("LuxauryCar Booked. $25/perKm!");
    }
}

public class CabBooking {
    public static void main(String[] args) {
        Bookable[] cabs = {new miniCab(), new suv(), new luxuaryCar()};

        for (Bookable cab : cabs){
            cab.book();
        }

    }
}
