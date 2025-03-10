// Subsystem #1: Hotel Booking
class HotelBooking {
    void bookHotel(String city, int days) {
        System.out.println("Hotel booked for " + days + " days in " + city);
    }
}

// Complex Subsystem #2: FlightBooking
class FlightBooking {
    public void bookFlight(String origin, String destination) {
        System.out.println("Flight booked from " + origin + " to " + destination);
    }
}

// Complex Subsystem #3: TourBooking
class TourBooking {
    public void bookTour(String city) {
        System.out.println("Adventure tour booked in " + city);
    }
}

// Facade class that simplifies complex subsystem interactions
class AdventureFacade {
    private HotelBooking hotel = new HotelBooking();
    private FlightBooking flight = new FlightBooking();
    private TourBooking tour = new TourBooking();

    public void bookCompleteAdventure(String homeCity, String destinationCity, int days) {
        System.out.println("Booking complete adventure tour...");
        flight.bookFlight(homeCity, destinationCity);
        hotel.bookHotel(destinationCity, days);
        tour.bookTour(destinationCity);
        System.out.println("Adventure tour booked successfully!");
    }
}

// Demo class
public class FacadePatternDemo {
    public static void main(String[] args) {
        AdventureFacade adventureFacade = new AdventureFacade();

        // Client interacts only with the Facade
        adventureFacade.bookCompleteAdventure("London", "Rome", 7);
    }
}
