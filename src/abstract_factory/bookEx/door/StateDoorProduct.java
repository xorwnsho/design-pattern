package abstract_factory.bookEx.door;

public class StateDoorProduct extends DoorProduct{

    public StateDoorProduct() {
        System.out.println("StateDoorFactory객체를 생성합니다.");
    }

    @Override
    public void makeAssemble() {
        System.out.println("메서드 호출 - StateDoorProduct.makeAssemble()");
        System.out.println("미국형 도어 장착");
    }
}
