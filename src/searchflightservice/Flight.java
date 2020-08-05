package searchflightservice;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String flightFrom;
    private String flightTo;
    private List<String> flightThrough;

    public Flight(String flightFrom, String flightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
        this.flightThrough = new ArrayList<>();
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    public List<String> getFlightThrough() {
        return flightThrough;
    }

    public void addFlightThrough(String airport){
        flightThrough.add(airport);
    }
}
