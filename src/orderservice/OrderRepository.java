package orderservice;

import java.time.LocalDateTime;

public interface OrderRepository {
    public boolean createOrder(final Customer customer, final Product product, final LocalDateTime dateOfOrder);
}
