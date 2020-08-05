package searchflightservice;

import java.util.HashMap;
import java.util.Map;

public class Timetable {
    Map<Integer, Flight> mapTimetable;

    public Timetable() {
        this.mapTimetable = new HashMap<>();
    }

    public Map<Integer, Flight> getTimetable() {
        return mapTimetable;
    }

}
