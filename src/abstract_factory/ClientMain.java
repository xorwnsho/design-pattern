package abstract_factory;

import abstract_factory.factory.Factory;
import abstract_factory.factory.KoreaFactory;
import abstract_factory.factory.StateFactory;

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
