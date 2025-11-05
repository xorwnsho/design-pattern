package abstract_factory.book_ex.factory;

import abstract_factory.book_ex.door.DoorProduct;
import abstract_factory.book_ex.door.KoreaDoorProduct;
import abstract_factory.book_ex.tire.KoreaTireProduct;
import abstract_factory.book_ex.tire.TireProduct;

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
