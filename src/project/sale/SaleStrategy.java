package project.sale;

public class SaleStrategy {

    public static int saleRate(int productPrice, float saleRate){
        int discountAmount = (int) (productPrice * saleRate);
        int discountedPrice = productPrice - discountAmount;

        System.out.println("할인율(" + ((int)(saleRate * 100)) + "%)");
        System.out.println("상품 가격: " + productPrice + " - " + discountAmount + " = " + discountedPrice);

        return discountedPrice;
    }

}
