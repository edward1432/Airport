import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class BookingSystem {

    private List<Passenger> passengers;
    private List<Flight> flights;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Happy Campany!!");
        System.out.println("What would you like to do? Type \"B\" means Booking, Type \"C\" means Canceling);
                
        in.next();

        // list all destinations you can choose

        //input user's destination

    }

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public void cancelFlight(Flight flight) { flights.remove(flight); }

    public void cancelFlightWithId(Integer id){
        flights.removeIf(flight -> flight.getFlightID() == id);
    }

    public void addPassengerToFlight(){

    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void printFLights() { flights.stream().map(f -> System.out.println(f.getFlightID()));}
}