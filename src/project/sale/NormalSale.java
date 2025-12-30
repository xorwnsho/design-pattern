package project.sale;

import static project.sale.SaleStrategy.saleRate;

public class NormalSale implements Sale{
    @Override
    public int sale(int productPrice) {
        int discountedPrice = saleRate(productPrice, 0.05F);
        return discountedPrice;
    }
}
