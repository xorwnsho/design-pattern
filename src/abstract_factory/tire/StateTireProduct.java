package abstract_factory.tire;

public class StateTireProduct extends TireProduct {

    public StateTireProduct() {
        System.out.println("StateTireProduct객체를 생성합니다.");
    }

    @Override
    public void makeAssemble() {
        System.out.println("메서드 호출 - StateTireProduct.makeAssemble()");
        System.out.println("미국형 타이어 장착");
    }
}
