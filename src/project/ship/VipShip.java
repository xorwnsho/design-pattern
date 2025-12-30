package project.ship;

import static project.ship.ShipStrategy.freeShip;

public class VipShip implements Ship{

    @Override
    public int calculateFinalPrice(int discountedPrice) {
        return freeShip(discountedPrice);
    }
}
