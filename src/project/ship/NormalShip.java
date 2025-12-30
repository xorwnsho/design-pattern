package project.ship;

import static project.ship.ShipStrategy.OneHundredThousandShip;

public class NormalShip implements Ship{

    @Override
    public int calculateFinalPrice(int discountedPrice) {
        return OneHundredThousandShip(discountedPrice);
    }
}
