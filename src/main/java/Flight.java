import java.util.ArrayList;
import java.util.UUID;

public class Flight {

    private ArrayList<Passenger> passengerManifest;
    private String flightID;
    private String flightDestination;

    public Flight(String flightDestination) {
        this.passengerManifest = new ArrayList<Passenger>();
        this.flightDestination = flightDestination;
        this.flightID = UUID.randomUUID().toString();
    }
    //will create some flight objects in the CLI class


    public ArrayList<Passenger> getPassengerManifest() {
        return passengerManifest;
    }

    public void setPassengerManifest(ArrayList<Passenger> passengerManifest) {
        this.passengerManifest = passengerManifest;
    }

    public void addPassenger(Passenger newPassenger) {
        this.passengerManifest.add(newPassenger);
    }

    public void removePassenger(Passenger removedPassenger) {
        this.passengerManifest.remove(removedPassenger);
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    public void printManifest(){
        passengerManifest.forEach(passenger -> System.out.println(passenger.getName()));
        if (passengerManifest.isEmpty()){
            System.out.println("\nNo passengers booked onto this flight!");
        }
    }

}
