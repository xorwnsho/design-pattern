package project.ship;

import static project.ship.ShipStrategy.freeShip;

public class VipShip implements Ship{

    @Override
    public void shipPrice(int discountedPrice) {
        freeShip(discountedPrice);
    }
}
