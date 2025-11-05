package abstract_factory.my_ex.concrete_product;

import abstract_factory.my_ex.abstract_product.Table;

public class ModernTable implements Table {
    @Override
    public void putOn() {
        System.out.println("모던한 테이블에 물건을 놓습니다.");
    }

    @Override
    public String getDescription() {
        return "크고 좋은 모던한 테이블";
    }
}
