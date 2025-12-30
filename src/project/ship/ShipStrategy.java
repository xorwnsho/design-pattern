package project.ship;

public class ShipStrategy {

    private static int finalPrice;

    public static int freeShip(int discountedPrice){
        finalPrice = discountedPrice;
        System.out.println("무료배송 적용");
        System.out.println("총 구매 가격 = " + discountedPrice);

        return finalPrice;
    }

    public static int OneHundredThousandShip(int discountedPrice){
        int shippingCost = 3_000;
        if (discountedPrice > 100_000) {
            System.out.println("100,000원 이상 구매 - 무료 배송");
            System.out.println("총 구매 가격 = " + discountedPrice);
            return finalPrice;
        } else {
            System.out.println("총 구매 가격 = " + discountedPrice + " + " + shippingCost + " = " + (discountedPrice + shippingCost));
            return finalPrice + shippingCost;
        }
    }
}
