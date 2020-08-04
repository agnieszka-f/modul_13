package orderservice;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest request() {
        Customer customer = new Customer("Anna", "Maj", "ul. Sienkiewicza 4, 37-500 Jarosław");
        Product product = new Toothbrush("Szczoteczka do zębów", 9.0, "średnia", "biały");
        LocalDateTime date = LocalDateTime.of(2020, 07, 12, 8, 40);

        return new OrderRequest(customer,product,date);
    }
}
