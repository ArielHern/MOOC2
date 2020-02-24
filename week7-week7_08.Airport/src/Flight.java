import java.util.HashMap;

public class Flight {
    private HashMap<String, String> flights;

    public Flight() {
        this.flights = new HashMap<String, String>();
    }

    public void add(String planeID, String departureCode, String destinationCode) {
        String departDestination = departureCode + "-" + destinationCode;
        this.flights.put(planeID, departDestination);
    }

//    public String toString() {
//        return this.flights.keySet() + this.flights.get(flights.keySet());
//    }

    public void printFlights(Plane plane) {
        for (String flight : this.flights.keySet()) {
            System.out.println(flight + plane.getPlanePas(flight) + " (" + this.flights.get(flight) + ")");
        }
        System.out.println("");

    }
}
