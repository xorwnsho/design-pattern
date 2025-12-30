package project.event;

import project.Grade;
import project.Member;
import project.sale.NormalSale;
import project.sale.Sale;
import project.sale.VipSale;
import project.ship.NormalShip;
import project.ship.Ship;
import project.ship.VipShip;

public class NoEvent implements Event{
    @Override
    public Sale createSale(Member member) {

        if(Grade.VIP.equals(member.getGrade())){
            return new VipSale();
        } return new NormalSale();
    }

    @Override
    public Ship createShip(Member member) {

        if(Grade.VIP.equals(member.getGrade())){
            return new VipShip();
        } return new NormalShip();
    }
}
