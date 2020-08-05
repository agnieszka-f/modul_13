package searchflightservice;

public class Application {

    public static void main(String[] args){

        InitSearch initSearch = new InitSearch();
        SearchFlight searchFlight = initSearch.init();

        String airport = "Kraków";
        searchFlight.toSearching(new SearchFrom(), airport);

        airport = "Gdańsk";
        searchFlight.toSearching(new SearchTo(), airport);

        airport = "Warszawa";
        searchFlight.toSearching(new SearchThrough(),airport);
    }
}
