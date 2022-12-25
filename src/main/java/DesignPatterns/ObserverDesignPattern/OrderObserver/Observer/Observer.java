package DesignPatterns.ObserverDesignPattern.OrderObserver.Observer;

import DesignPatterns.ObserverDesignPattern.OrderObserver.Observable.Order;

public interface Observer {

    void update(Order order);
}
