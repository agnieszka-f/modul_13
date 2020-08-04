package foot2door;

import java.util.List;

public class ExtraFoodShopOffer implements ProducentOffer{
    private ExtraFoodShopRetrieve extraFoodShopRetrieve;
    public List<Product> getProductList() {
        extraFoodShopRetrieve = new ExtraFoodShopRetrieve();
        return extraFoodShopRetrieve.generate();
    }
}
