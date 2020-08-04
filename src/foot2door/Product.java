package foot2door;

public class Product {
    private String productName;
    private int pcs;

    public Product(String productName, int pcs) {
        this.productName = productName;
        this.pcs = pcs;
    }

    public String getProductName() {
        return productName;
    }

    public int getPcs() {
        return pcs;
    }
}
