package orderservice;

public class Toothbrush implements Product{
    String productName;
    double price;
    String hardness;
    String color;

    public Toothbrush(String productName, double price, String hardness, String color) {
        this.productName = productName;
        this.price = price;
        this.hardness = hardness;
        this.color = color;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getHardness() {
        return hardness;
    }

    public String getColor() {
        return color;
    }
}
