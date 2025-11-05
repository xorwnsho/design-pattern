package abstract_factory.book_ex.factory;

import abstract_factory.book_ex.door.DoorProduct;
import abstract_factory.book_ex.door.StateDoorProduct;
import abstract_factory.book_ex.tire.StateTireProduct;
import abstract_factory.book_ex.tire.TireProduct;

public class StateFactory extends Factory {

    public StateFactory() {
        System.out.println("StateFactory객체를 생성합니다.");
    }

    @Override
    public TireProduct createTire() {
        return new StateTireProduct();
    }

    @Override
    public DoorProduct createDoor() {
        return new StateDoorProduct();
    }
}
