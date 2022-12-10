package main.java.com.github.solid.dip;

public class ProductFactory {

    public static ProductRepository create() {
        return new SQLProductRepository();
    }
}
