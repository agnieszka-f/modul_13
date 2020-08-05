package searchflightservice;

public class InitSearch {
    public SearchFlight init(){
        Timetable timetable = new Timetable();
        GenerateTimetable generateTimetable = new GenerateTimetable(timetable);
        generateTimetable.generate();
        SearchFlight searchFlight = new SearchFlight(timetable);

        return searchFlight;
    }
}
