package foot2door;

import java.util.List;

public interface ProducentOrderFulfillment {
    public boolean process(List<Product> listOfOrderedProducts);
}
