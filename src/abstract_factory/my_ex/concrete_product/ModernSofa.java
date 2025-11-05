package abstract_factory.my_ex.concrete_product;

import abstract_factory.my_ex.abstract_product.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("모던한 소파에 눕습니다.");
    }

    @Override
    public String getDescription() {
        return "눕기 좋은 모던한 소파";
    }
}
