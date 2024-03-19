import java.util.ArrayList;

public class Airport {

    private ArrayList<Airplane> flights;

    public Airport(ArrayList<Airplane> flights) {
        this.flights = new ArrayList<>();
    }

    public void addFlight(Airplane flight) {
        flights.add(flight);
    }

    public void removeFlight(Airplane flight) {
        flights.remove(flight);
    }


}
