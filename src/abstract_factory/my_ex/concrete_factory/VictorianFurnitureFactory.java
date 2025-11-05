package abstract_factory.my_ex.concrete_factory;

import abstract_factory.my_ex.abstract_factory.FurnitureFactory;
import abstract_factory.my_ex.abstract_product.Chair;
import abstract_factory.my_ex.abstract_product.Sofa;
import abstract_factory.my_ex.abstract_product.Table;
import abstract_factory.my_ex.concrete_product.*;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
