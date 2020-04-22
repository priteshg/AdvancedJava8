package advanced_java_8.example;

public class Price {

    private int productID;
    private double price;
    private double time;

    public Price(int productID, double price, double time) {
        this.productID = productID;
        this.price = price;
        this.time = time;
    }

    public int getProductID() {
        return productID;
    }

    public double getPrice() {
        return price;
    }

    public double getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Price{" +
                "productID=" + productID +
                ", price=" + price +
                ", time=" + time +
                '}';
    }
}
