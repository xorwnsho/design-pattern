package abstract_factory.my_ex.concrete_product;

import abstract_factory.my_ex.abstract_product.Table;

public class VictorianTable implements Table {
    @Override
    public void putOn() {
        System.out.println("빅토리아풍 테이블에 물건을 놓습니다.");
    }

    @Override
    public String getDescription() {
        return "빅토리아풍 테이블";
    }
}
