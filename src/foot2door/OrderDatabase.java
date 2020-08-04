package foot2door;

public class OrderDatabase implements DatabaseService {
    public void createAnEntry(Producent producent,Order order){
        order.getProductOrderList().stream().map(x -> x.getProductName()+" " + x.getPcs())
                                            .forEach(x -> System.out.println("Tworzę wpis: "+producent.getProducentName()+" "+x));
    }
}
