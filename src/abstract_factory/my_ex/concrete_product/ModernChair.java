package abstract_factory.my_ex.concrete_product;

import abstract_factory.my_ex.abstract_product.Chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("모던한 의자에 앉습니다.");
    }

    @Override
    public String getDescription() {
        return "예쁘고 모던한 의자";
    }
}
