package main.java.com.github.solid.dip;

public class ProductCatalog {

    public void listAllProducts() {

        SQLProductRepository sqlProductRepository = new SQLProductRepository();
        sqlProductRepository.getAllProductNames();
    }
}
