package searchflightservice;

public class GenerateTimetable {
    private Timetable timetable;
    private Flight flight;

    public GenerateTimetable(Timetable timetable) {
        this.timetable = timetable;
    }

    public void generate(){
        flight = new Flight("Rzeszów","Gdańsk");
        flight.addFlightThrough("Warszawa");
        timetable.mapTimetable.put(1, flight);

        flight = new Flight("Kraków", "Warszawa");
        timetable.mapTimetable.put(2, flight);

        flight = new Flight("Kraków","Gdańsk");
        flight.addFlightThrough("Warszawa");
        timetable.mapTimetable.put(3, flight);

        flight = new Flight("Rzeszów","Szczecin");
        flight.addFlightThrough("Warszawa");
        flight.addFlightThrough("Gdańsk");
        timetable.mapTimetable.put(4, flight);
    }
}
