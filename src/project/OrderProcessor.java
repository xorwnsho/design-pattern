package project;

import project.event.Event;
import project.sale.Sale;
import project.ship.Ship;

public class OrderProcessor {

    private final Event event;
    private final Member member;

    public OrderProcessor(Event event, Member member) {
        this.event = event;
        this.member = member;
    }

    public void processOrder(int myProduct) {
        Sale sale = event.createSale(member);
        Ship ship = event.createShip(member);

        int discountedPrice = sale.calculateDiscountedPrice(myProduct);
        ship.calculateFinalPrice(discountedPrice);

    }
}
