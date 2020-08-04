package foot2door;

public class ClassRetrieve {
    public Request retrieve(){
        Producent producent = new ExtraFoodShop();
        ProducentOffer producentOffer = new ExtraFoodShopOffer();

        createOfertViewer(producentOffer, producent);

        Order order = createOrder();
        ProducentOrderFulfillment producentOrderFulfillment = new ExtraFoodShopOrderFulfillment();

        return new Request(producent,order,producentOrderFulfillment);
    }
    public Order createOrder(){
        Order order = new Order();
        order.addProductOrderList(new Product("Jabłko", 30));
        order.addProductOrderList(new Product("Pomarańcza", 30));

        return order;
    }
    public void createOfertViewer(ProducentOffer producentOffer, Producent producent){
        OfertViewer ofertViewer = new OfertViewer();
        ofertViewer.viewer(producentOffer, producent);
    }
}
