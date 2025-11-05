package abstract_factory.bookEx.factory;

import abstract_factory.bookEx.door.DoorProduct;
import abstract_factory.bookEx.door.KoreaDoorProduct;
import abstract_factory.bookEx.tire.KoreaTireProduct;
import abstract_factory.bookEx.tire.TireProduct;

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
