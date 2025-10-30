package factory_method.pizza;

import factory_method.pizza.store.ChicagoPizzaStore;
import factory_method.pizza.store.NYPizzaStore;
import factory_method.pizza.store.PizzaStore;
import factory_method.pizza.style.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("===뉴욕 지점에서 주문===");
        Pizza pizza1 = nyStore.orderPizza("cheese");
        System.out.println("받은 피자: " + pizza1.getClass().getSimpleName());

        System.out.println("\n===시카고 지점에서 주문===");
        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("받은 피자: " + pizza2.getClass().getSimpleName());
    }
}
