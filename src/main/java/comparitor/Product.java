package advanced_java_8.comparitor;

import net.minidev.json.JSONUtil;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Product {
    private Integer productID;
    private Integer orderID;
    private Double cost;

    public Product(Integer productID, Integer orderID, Double cost) {
        this.productID = productID;
        this.orderID = orderID;
        this.cost = cost;
    }

    public Integer getProductID() {
        return productID;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public Double getCost() {
        return cost;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, 10, 60.00));
        products.add(new Product(3, 11, 70.00));
        products.add(new Product(4, 12, 55.00));
        products.add(new Product(5, 13, 10.00));


        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product product, Product t1) {
                return product.cost.compareTo(t1.cost);
            }
        };

        Comparator<Product> productComparatorLambda = (a, b) -> a.getCost().compareTo(b.getCost());

        System.out.println("hello");
        Collections.sort(products, productComparatorLambda);

        for (Product p : products) {
            System.out.println(p.getCost());
        }
    }

}
