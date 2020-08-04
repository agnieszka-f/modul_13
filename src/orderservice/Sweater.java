package orderservice;

public class Sweater implements Product{
    String productName;
    double price;
    String color;
    String material;

    public Sweater(String productName, double price, String color, String material) {
        this.productName = productName;
        this.price = price;
        this.color = color;
        this.material = material;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}
