// Parent class
class Ride {
    void bookRide() {
        System.out.println("Booking a generic ride...");
    }
}

// Child class 1
class CarRide extends Ride {
    @Override
    void bookRide() {
        System.out.println("Booking a Car Ride with AC service.");
    }
}

// Child class 2
class BikeRide extends Ride {
    @Override
    void bookRide() {
        System.out.println("Booking a Bike Ride for quick travel.");
    }
}

// Main class
public class RuntimePolymorphismDemo {
    public static void main(String[] args) {
        Ride r;

        r = new CarRide();  // Dynamic binding
        r.bookRide();

        r = new BikeRide(); // Dynamic binding
        r.bookRide();
    }
}
