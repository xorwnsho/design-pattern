package abstract_factory.my_ex;

import abstract_factory.my_ex.abstract_factory.FurnitureFactory;
import abstract_factory.my_ex.abstract_product.Chair;
import abstract_factory.my_ex.abstract_product.Sofa;
import abstract_factory.my_ex.abstract_product.Table;

public class Order {

    private Chair chair;
    private Sofa sofa;
    private Table table;

    public Order(FurnitureFactory factory) {
        System.out.println("인테리어 세트를 주문합니다. ");
        chair = factory.createChair();
        sofa = factory.createSofa();
        table = factory.createTable();
    }

    public void userFurniture(){
        System.out.println("\n----가구 사용 시작----");
        chair.sitOn();
        sofa.lieOn();
        table.putOn();
        System.out.println("----가구 설명----");

        System.out.println(chair.getDescription());
        System.out.println(sofa.getDescription());
        System.out.println(table.getDescription());
        System.out.println("-----------------");
    }
}
