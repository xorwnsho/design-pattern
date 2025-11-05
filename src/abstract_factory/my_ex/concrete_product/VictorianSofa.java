package abstract_factory.my_ex.concrete_product;


import abstract_factory.my_ex.abstract_product.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("빅토리아풍 소파에 눕습니다.");
    }

    @Override
    public String getDescription() {
        return "빅토리아풍 소파";
    }
}
