package foot2door;
import java.util.*;

public class Order {
    private List<Product> productOrderList;

    public Order() {
        this.productOrderList = new ArrayList<>();
    }
    public void addProductOrderList(Product product) { productOrderList.add(product); }

    public List<Product> getProductOrderList() {
        return productOrderList;
    }
}
