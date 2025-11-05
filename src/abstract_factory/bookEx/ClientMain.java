package abstract_factory.bookEx;

import abstract_factory.bookEx.factory.Factory;
import abstract_factory.bookEx.factory.KoreaFactory;
import abstract_factory.bookEx.factory.StateFactory;

public class ClientMain {
    public static void main(String[] args) {
        System.out.println("추상 팩토리 패턴을 실습합니다.");

        Factory factory = new KoreaFactory();
        factory.createTire().makeAssemble();
        factory.createDoor().makeAssemble();

        System.out.println();
        factory = new StateFactory();
        factory.createTire().makeAssemble();
        factory.createDoor().makeAssemble();
    }
}
