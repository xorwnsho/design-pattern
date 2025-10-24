package singleton.my_database;

public class Product {
    private static int skuNumber = 1001;
    private int sku;
    private String productName;

    public Product(String productName) {
        this.sku = skuNumber++;
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product[SKU=" + sku + ", Name=" + productName + "]";
    }
}
