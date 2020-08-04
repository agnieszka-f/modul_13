package orderservice;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository{
    public boolean createOrder(final Customer customer, final Product product, final LocalDateTime dateOfOrder){
        System.out.println("Zapis do bazy danych");
        return true;
    }
}
