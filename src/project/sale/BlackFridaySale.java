package project.sale;

import static project.sale.SaleStrategy.saleRate;

public class BlackFridaySale implements Sale {

    @Override
    public int calculateDiscountedPrice(int productPrice) {
        int discountedPrice = saleRate(productPrice, 0.3F);
        return discountedPrice;
    }
}