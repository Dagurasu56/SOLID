package main.java.com.github.solid.dip;

public class ProductCatalog {

    public void listAllProducts() {

        ProductRepository productRepository = ProductFactory.create();
        productRepository.getAllProductNames();
    }
}
