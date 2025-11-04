package abstract_factory.factory;

import abstract_factory.door.DoorProduct;
import abstract_factory.door.KoreaDoorProduct;
import abstract_factory.tire.KoreaTireProduct;
import abstract_factory.tire.TireProduct;

public class KoreaFactory extends Factory {

    public KoreaFactory() {
        System.out.println("KoreaFactory객체를 생성합니다.");
    }

    @Override
    public TireProduct createTire() {
        return new KoreaTireProduct();
    }

    @Override
    public DoorProduct createDoor() {
        return new KoreaDoorProduct();
    }
}
