package abstract_factory.book_ex.factory;

import abstract_factory.book_ex.door.DoorProduct;
import abstract_factory.book_ex.tire.TireProduct;

public abstract class Factory {

    abstract public TireProduct createTire();
    abstract public DoorProduct createDoor();
}
