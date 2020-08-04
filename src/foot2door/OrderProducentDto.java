package foot2door;

public class OrderProducentDto {
    Producent producent;
    Order order;
    boolean isAccepted;

    public OrderProducentDto(Producent producent, Order order, boolean isAccepted) {
        this.producent = producent;
        this.order = order;
        this.isAccepted = isAccepted;
    }

    public Producent getProducent() {
        return producent;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isAccepted() {
        return isAccepted;
    }
}
