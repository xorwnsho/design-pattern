package abstract_factory.factory;

import abstract_factory.door.DoorProduct;
import abstract_factory.tire.TireProduct;

public abstract class Factory {

    abstract public TireProduct createTire();
    abstract public DoorProduct createDoor();
}
