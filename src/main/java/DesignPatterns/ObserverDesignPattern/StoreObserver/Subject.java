package DesignPatterns.ObserverDesignPattern.StoreObserver;

public interface Subject {

    void registerObserver(Event event, Observer observer);

    void removeObserver(Event event, Observer observer);

    void notifyObservers(Event event);
}
