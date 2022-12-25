package DesignPatterns.ObserverDesignPattern.OrderObserver.Observer;

import DesignPatterns.ObserverDesignPattern.OrderObserver.Observable.Order;

public class PriceObserver implements Observer {
    @Override
    public void update(Order order) {

        double total = order.getTotalPrice();
        if (total >= 500) {
            //applicable for 50$ discount
            order.setDiscount(50);
        }
    }
}
