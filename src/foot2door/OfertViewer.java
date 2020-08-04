package foot2door;

public class OfertViewer {
    public void viewer(ProducentOffer producentOffer, Producent producent){
        System.out.println("Lista produktów dostępna u : "+producent.getProducentName());
        producentOffer.getProductList().stream().map(x -> x.getProductName()+", szt: "+x.getPcs()).forEach(x -> System.out.println(x));
    }
}
