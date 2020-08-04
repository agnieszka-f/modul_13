package challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainMovieStore {
    public static void main(String[] args){
        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> a = movieStore.getMovies();
        String result = a.entrySet().stream().map(x->x.getValue()).flatMap(x->x.stream()).collect(Collectors.joining(" ! "));

        System.out.println(result);
    }
}
