package foot2door;

import java.util.*;

public class ProductInformation {

    private List<Product> productList;

    public ProductInformation() {
        productList = new ArrayList<>();
    }
    public List<Product> getProductList(){ return productList; }
    public void addProductToList(Product product){ productList.add(product); }
}
