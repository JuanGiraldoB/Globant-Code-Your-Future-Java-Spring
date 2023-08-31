package main.Services;

import main.Entities.Dog;
import main.Entities.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductService {

    HashMap<Integer, Product> productHashMap;
    Scanner scan;
    private static Integer key = 0;

    public ProductService() {
        this.productHashMap = new HashMap<>();
        this.scan = new Scanner(System.in);
    }

    public Product createProduct() {
        System.out.print("Name: ");
        String name = scan.next();

        System.out.print("Price: ");
        int price = scan.nextInt();

        return new Product(name, price);
    }

    public void addProduct(Product product) {
        this.productHashMap.put(key++, product);
    }

    public void printProducts() {
        for (Map.Entry<Integer, Product> entry : productHashMap.entrySet()) {
            System.out.println("Key=" + entry.getKey() + ", Datos de producto" + entry.getValue());
        }
    }

}
