package main;

import main.Entities.Product;
import main.Services.ProductService;

public class Main6 {
    public static void main(String[] args) {
        ProductService ps = new ProductService();
        Product product = ps.createProduct();
        Product product1 = ps.createProduct();
        ps.addProduct(product);
        ps.addProduct(product1);
        ps.printProducts();
    }
}
