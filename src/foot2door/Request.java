package foot2door;

public class Request {
    private Producent producent;
    private Order order;
    private ProducentOrderFulfillment producentOrderFulfillment;

    public Request(Producent producent, Order order, ProducentOrderFulfillment producentOrderFulfillment) {
        this.producent = producent;
        this.order = order;
        this.producentOrderFulfillment = producentOrderFulfillment;
    }

    public Producent getProducent() {
        return producent;
    }

    public Order getOrder() {
        return order;
    }

    public ProducentOrderFulfillment getProducentOrderFulfillment() {
        return producentOrderFulfillment;
    }
}
