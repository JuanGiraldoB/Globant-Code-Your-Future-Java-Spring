package Services;

import Entities.Product;
import Persistences.DAOProduct;

import java.util.Collection;

public class ProductService {

    private final DAOProduct daoProduct;

    public ProductService() {
        this.daoProduct = new DAOProduct("store");
    }

    public void createProduct(String name, double price, int makerID) throws Exception {
        Product product = new Product(name, price, makerID);
        daoProduct.saveProduct(product);
    }

    public Collection<Product> getProducts() throws Exception {

        try{
            return daoProduct.getProducts();
        }catch (Exception e){
            throw e;
        }
    }

    public Collection<Product> getProductsNameAndPrice() throws Exception {

        try{
            return daoProduct.getProductNameAndPrice();
        }catch (Exception e){
            throw e;
        }
    }

    public void printProducts() throws Exception {

        try{

            Collection<Product> products = getProducts();

            if (products.isEmpty()) {
                throw new Exception("Object is empty");
            } else {
                for (Product p : products) {
                    System.out.println(p);
                }
            }


        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }

    }

    public void printProductsNameAndPrice() throws Exception {

        try{

            Collection<Product> products = getProductsNameAndPrice();

            if (products.isEmpty()) {
                throw new Exception("Object is empty");
            } else {
                for (Product p : products) {
                    System.out.println(p);
                }
            }


        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }

    }

    public void printProductsByPriceRange() throws Exception{
        Collection<Product> products = getProductsNameAndPrice();

        if (products.isEmpty()) {
            throw new Exception("Object is empty");
        } else {
            for (Product p : products) {
                if (p.getPrice() >= 120 && p.getPrice() <= 202){
                    System.out.println(p);
                }
            }
        }
    }
}
