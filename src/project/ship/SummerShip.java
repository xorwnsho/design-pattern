package project.ship;

import static project.ship.ShipStrategy.freeShip;

public class SummerShip implements Ship {

    @Override
    public void shipPrice(int discountedPrice) {
        freeShip(discountedPrice);
    }
}

