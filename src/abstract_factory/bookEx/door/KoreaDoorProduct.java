package abstract_factory.bookEx.door;

public class KoreaDoorProduct extends DoorProduct{

    public KoreaDoorProduct() {
        System.out.println("KoreaDoorProduct객체를 생성합니다.");
    }

    @Override
    public void makeAssemble() {
        System.out.println("메서드 호출 - KoreaDoorProduct.makeAssemble()");
        System.out.println("한국형 도어 장착");
    }
}
