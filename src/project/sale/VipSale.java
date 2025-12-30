package project.sale;

import static project.sale.SaleStrategy.saleRate;

public class VipSale implements Sale{
    @Override
    public int calculateDiscountedPrice(int productPrice) {
        int discountedPrice = saleRate(productPrice, 0.15F);
        return discountedPrice;
    }
}
