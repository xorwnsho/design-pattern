package project.event;

import project.Member;
import project.sale.BlackFridaySale;
import project.sale.Sale;
import project.ship.BlackFridayShip;
import project.ship.Ship;

public class BlackFridayEvent implements Event{

    @Override
    public Sale createSale(Member member) {
        return new BlackFridaySale();
    }

    @Override
    public Ship createShip(Member member) {
        return new BlackFridayShip();
    }
}

