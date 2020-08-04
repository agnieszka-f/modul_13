package orderservice;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService{
    public boolean order(final Customer customer, final Product product, final LocalDateTime dateOfOrder){
        System.out.println("Zamawiający: "+customer.getFirsName()+" "+customer.getSecondName()
                            +", zamawiany produkt: "+product.getProductName()+", cena: "+product.getPrice()
                            +", data zamówienia: "+dateOfOrder.toString());
        return true;
    }
}
