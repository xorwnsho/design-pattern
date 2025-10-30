package factory_method.pizza.store;

import factory_method.pizza.style.Pizza;
import factory_method.pizza.style.ChicagoStyleCheesePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }

        System.out.println(type + "피자는 시카고 지점에 없는 메뉴입니다.");
        return null;
    }
}
