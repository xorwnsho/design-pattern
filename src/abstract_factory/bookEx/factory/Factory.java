package abstract_factory.bookEx.factory;

import abstract_factory.bookEx.door.DoorProduct;
import abstract_factory.bookEx.tire.TireProduct;

public abstract class Factory {

    abstract public TireProduct createTire();
    abstract public DoorProduct createDoor();
}
