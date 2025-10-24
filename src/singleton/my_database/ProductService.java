package singleton.my_database;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private List<Product> productDatabase = new ArrayList<>();

    private Logger logger = Logger.getInstance();

    public void addProduct(String productName){
        logger.log("ProductService", "Adding product: " + productName);

        Product newProduct = new Product(productName);

        productDatabase.add(newProduct);
        System.out.println("    -> (Logic) Product added to Database: " + newProduct.toString());

        logger.log("ProductService", "SUCCESS: product '" + productName + "' added. Total products: " + productDatabase.size());
    }
}
