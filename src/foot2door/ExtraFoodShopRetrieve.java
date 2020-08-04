package foot2door;

import java.util.*;
public class ExtraFoodShopRetrieve {
    private ProductInformation productInformation;

    public List<Product> generate(){
        productInformation = new ProductInformation();
        productInformation.addProductToList(new Product("Jabłko",80));
        productInformation.addProductToList(new Product("Gruszka",100));
        productInformation.addProductToList(new Product("Pomarańcza",50));

        return productInformation.getProductList();
    }
}
