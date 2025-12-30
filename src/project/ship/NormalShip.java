package project.ship;

import static project.ship.ShipStrategy.OneHundredThousandShip;

public class NormalShip implements Ship{

    @Override
    public void shipPrice(int discountedPrice) {
        OneHundredThousandShip(discountedPrice);
    }
}
