package factory_method.pizza.store;

import factory_method.pizza.style.Pizza;

public abstract class PizzaStore {

    public final Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        System.out.println("--- " + type + "피자 주문 처리 시작 ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("--- " + type + "피자 준비 완료 ---");
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
