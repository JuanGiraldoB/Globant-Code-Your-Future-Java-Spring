package Main;

import Services.ProductService;

public class MainStore {

    public static void main(String[] args) {

        ProductService ps = new ProductService();

        try{

            ps.createProduct("bone", 150d, 1);
            ps.createProduct("donut", 200, 2);
            ps.printProducts();
            ps.getProductsNameAndPrice();
            ps.printProductsNameAndPrice();
            ps.printProductsByPriceRange();

        }catch (Exception e){
            e.printStackTrace();
            e.getMessage();
        }

    }
}
