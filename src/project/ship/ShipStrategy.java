package project.ship;

public class ShipStrategy {

    public static void freeShip(int discountedPrice){
        System.out.println("무료배송 적용");
        System.out.println("총 구매 가격 = " + discountedPrice);
    }

    public static void OneHundredThousandShip(int discountedPrice){
        int shippingCost = 3_000;
        if (discountedPrice > 100_000) {
            System.out.println("총 구매 가격 = " + discountedPrice);
        } else {
            System.out.println("총 구매 가격 = " + discountedPrice + " + " + shippingCost + " = " + (discountedPrice + shippingCost));
        }
    }
}
