package Persistences;

import Entities.Product;

import java.util.ArrayList;
import java.util.Collection;

public final class DAOProduct extends DAO{

    public DAOProduct(String database) {
        super(database);
    }

    public void saveProduct(Product product) throws Exception {

        try {
            checkNotNull(product);

            String query = String.format("INSERT INTO Product (name, price, maker_id) VALUES ('%s', %f, %d);",
                    product.getName(), product.getPrice(), product.getMakerID());

            cudDB(query);
        }catch (Exception e){
            throw e;
        }finally {
            closeConnectionDB();
        }

    }

    public void updateProductName(Product product) throws Exception{
        try{
            checkNotNull(product);

            String query = String.format("UPDATE Product SET name = '%s' WHERE id = %d;",
                    product.getName(), product.getId());

            cudDB(query);

        }catch (Exception e){
            throw e;
        }finally {
            closeConnectionDB();
        }
    }

    public void deleteProduct(int id) throws Exception {
        try {

            String query = String.format("DELETE FROM product WHERE id = %d;", id);
            cudDB(query);
        } catch (Exception e) {
            throw e;
        } finally {
            closeConnectionDB();
        }
    }

    public Collection<Product> getProducts() throws Exception {
        Collection<Product> products = new ArrayList<>();
        try {
            String query = "SELECT * FROM product;";
            readDB(query);

            Product product = null;

            while (resultSet.next()) {
                product = new Product();
                product.setId(resultSet.getInt(1));
                product.setName(resultSet.getString(2));
                product.setPrice(resultSet.getDouble(3));
                product.setMakerID(resultSet.getInt(4));

                products.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            closeConnectionDB();
            return products;
        }
    }

    public Collection<Product> getProductNameAndPrice() throws Exception {
        Collection<Product> products = new ArrayList<>();
        try {
            String query = "SELECT name, price FROM product;";
            readDB(query);

            Product product = null;

            while (resultSet.next()) {
                product = new Product();
                product.setName(resultSet.getString(1));
                product.setPrice(resultSet.getDouble(2));

                products.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            closeConnectionDB();
            return products;
        }
    }

}
