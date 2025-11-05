package abstract_factory.my_ex.concrete_factory;

import abstract_factory.my_ex.abstract_factory.FurnitureFactory;
import abstract_factory.my_ex.abstract_product.Chair;
import abstract_factory.my_ex.abstract_product.Sofa;
import abstract_factory.my_ex.abstract_product.Table;
import abstract_factory.my_ex.concrete_product.ModernChair;
import abstract_factory.my_ex.concrete_product.ModernSofa;
import abstract_factory.my_ex.concrete_product.ModernTable;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
