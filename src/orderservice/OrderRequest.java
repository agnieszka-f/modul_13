package orderservice;

import java.time.LocalDateTime;

public class OrderRequest {
    Customer customer;
    Product product;
    LocalDateTime date;

    public OrderRequest(Customer customer, Product product, LocalDateTime date) {
        this.customer = customer;
        this.product = product;
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
