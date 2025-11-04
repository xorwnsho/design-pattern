package abstract_factory.factory;

import abstract_factory.door.DoorProduct;
import abstract_factory.door.StateDoorProduct;
import abstract_factory.tire.StateTireProduct;
import abstract_factory.tire.TireProduct;

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
