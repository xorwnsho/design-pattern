package project.event;

import project.Member;
import project.sale.Sale;
import project.sale.SummerSale;
import project.ship.Ship;
import project.ship.SummerShip;

public class SummerEvent implements Event{

    @Override
    public Sale createSale(Member member) {
        return new SummerSale();
    }

    @Override
    public Ship createShip(Member member) {
        return new SummerShip();
    }
}
