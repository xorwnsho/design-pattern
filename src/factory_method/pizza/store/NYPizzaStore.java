package factory_method.pizza.store;

import factory_method.pizza.style.Pizza;
import factory_method.pizza.style.NYStyleCheesePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if(type.equals("pepperoni")){
            // return new NYStylePepperoniPizza();
        }

        System.out.println(type + " 피자는 뉴욕 지점에 없는 메뉴 입니다.");
        return null;
    }
}
