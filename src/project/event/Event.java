package project.event;

import project.Member;
import project.sale.Sale;
import project.ship.Ship;

public interface Event {
    Sale createSale(Member member);
    Ship createShip(Member member);
}
