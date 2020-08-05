package searchflightservice;

public class SearchFlight {
    Timetable timetable;

    public SearchFlight(Timetable timetable) {
        this.timetable = timetable;

    }
    public void toSearching(SearchService searchService, String airport){

        searchService.search(airport,timetable.getTimetable().entrySet().stream());
    }
 }
