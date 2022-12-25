package DesignPatterns.ObserverDesignPattern.OrderObserver.Observer;

import DesignPatterns.ObserverDesignPattern.OrderObserver.Observable.Order;

public class QuantityObserver implements Observer {

    /*
    Upto 5 orders shipping cost is standard 10$
    For each order above 5, charge 2$
     */
    @Override
    public void update(Order order) {

        int count = order.getItemQuantity();
        if (count <= 5) {
            order.setShippingCost(10);
        } else {
            order.setShippingCost(10 + (count - 5) * 2);
        }
    }
}
