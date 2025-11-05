package abstract_factory.bookEx.factory;

import abstract_factory.bookEx.door.DoorProduct;
import abstract_factory.bookEx.door.StateDoorProduct;
import abstract_factory.bookEx.tire.StateTireProduct;
import abstract_factory.bookEx.tire.TireProduct;

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
