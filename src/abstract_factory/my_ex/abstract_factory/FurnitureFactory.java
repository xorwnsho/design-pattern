package abstract_factory.my_ex.abstract_factory;

import abstract_factory.my_ex.abstract_product.Chair;
import abstract_factory.my_ex.abstract_product.Sofa;
import abstract_factory.my_ex.abstract_product.Table;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
