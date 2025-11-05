package abstract_factory.my_ex.concrete_product;

import abstract_factory.my_ex.abstract_product.Chair;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("빅토리아풍 의자에 앉습니다.");
    }

    @Override
    public String getDescription() {
        return "빅토리아품 의자";
    }
}
