package DesignPatterns.ObserverDesignPattern.OrderObserver;

import DesignPatterns.ObserverDesignPattern.OrderObserver.Observable.Order;
import DesignPatterns.ObserverDesignPattern.OrderObserver.Observer.Observer;
import DesignPatterns.ObserverDesignPattern.OrderObserver.Observer.PriceObserver;
import DesignPatterns.ObserverDesignPattern.OrderObserver.Observer.QuantityObserver;

public class Client {

    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderId("order101");
        order.setItemQuantity(15);
        order.setTotalPrice(3000);

        Observer priceObserver = new PriceObserver();
        Observer quantityObserver = new QuantityObserver();

        order.addObserver(priceObserver);
        order.addObserver(quantityObserver);
        order.addItem(300);

        System.out.println(order);


    }
}
