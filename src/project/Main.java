package project;

import project.event.BlackFridayEvent;
import project.event.Event;
import project.event.NoEvent;
import project.event.SummerEvent;

public class Main {

    public static void main(String[] args) {

        // BlackFriday or SummerSale or .... 선택가능
//        Event event = new BlackFridayEvent();
//        Event event = new SummerEvent();
        Event event = new NoEvent();

        Member oh = new Member("ohjuntaek", Grade.NORMAL);

        OrderProcessor processor = new OrderProcessor(event, oh);
        
        int myProduct = 100_000;
        processor.processOrder(myProduct);
    }
}