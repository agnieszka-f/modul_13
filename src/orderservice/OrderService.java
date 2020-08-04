package orderservice;

import java.time.LocalDateTime;

public interface OrderService {
    public boolean order(final Customer customer, final Product product, final LocalDateTime dateOfOrder);
}
