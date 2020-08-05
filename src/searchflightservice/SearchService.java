package searchflightservice;

import java.util.Map;
import java.util.stream.Stream;

public interface SearchService {
    public void search(String airport,  Stream<Map.Entry<Integer, Flight>> stream);
}
