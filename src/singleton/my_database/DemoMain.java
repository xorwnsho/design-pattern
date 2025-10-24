package singleton.my_database;

public class DemoMain {
    public static void main(String[] args) {

        System.out.println("----- 프로그램 시작 -----");

        UserService userService = new UserService();
        ProductService productService = new ProductService();

        userService.createUser("OH");
        userService.createUser("WANG");
        userService.createUser("KANG");
        productService.addProduct("MAC BOOK");
    }
}
