package abstract_factory.book_ex.tire;

public class KoreaTireProduct extends TireProduct {

    public KoreaTireProduct() {
        System.out.println("KoreaTireProduct객체를 생성합니다.");
    }

    @Override
    public void makeAssemble() {
        System.out.println("메서드 호출 - KoreaTireProduct.makeAssemble()");
        System.out.println("한국형 타이어 장착");
    }
}
