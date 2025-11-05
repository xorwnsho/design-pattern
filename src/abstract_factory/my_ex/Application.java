package abstract_factory.my_ex;


import abstract_factory.my_ex.abstract_factory.FurnitureFactory;
import abstract_factory.my_ex.concrete_factory.ModernFurnitureFactory;
import abstract_factory.my_ex.concrete_factory.VictorianFurnitureFactory;

public class Application {

    public static void main(String[] args) {

        FurnitureFactory factory;

        factory = new VictorianFurnitureFactory();
        Order order = new Order(factory);
        order.userFurniture();

        factory = new ModernFurnitureFactory();
        order = new Order(factory);
        order.userFurniture();
    }
}
