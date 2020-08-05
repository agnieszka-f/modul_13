package searchflightservice;

import java.util.Map;
import java.util.stream.Stream;

public class SearchFrom implements SearchService {
    @Override
    public void search(String airport,  Stream<Map.Entry<Integer, Flight>> stream) {
        System.out.println("Loty z: " + airport);
        stream.filter(x -> x.getValue().getFlightFrom().equals(airport))
                .forEach(x->System.out.println(x.getKey()+" "+x.getValue().getFlightFrom()+" -> "+x.getValue().getFlightTo()));
    }
}
