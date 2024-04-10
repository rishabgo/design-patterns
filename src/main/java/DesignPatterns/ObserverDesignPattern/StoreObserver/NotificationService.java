package DesignPatterns.ObserverDesignPattern.StoreObserver;

import java.util.*;

public class NotificationService implements Subject {

    private final Map<Event, List<Observer>> customerMap;

    public NotificationService() {
        this.customerMap = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event -> customerMap.put(event, new ArrayList<>()));
    }

    @Override
    public void registerObserver(Event event, Observer observer) {
        customerMap.get(event).add(observer);
    }

    @Override
    public void removeObserver(Event event, Observer observer) {
       customerMap.get(event).remove(observer);
    }

    @Override
    public void notifyObservers(Event event) {
        customerMap.get(event).forEach(observer -> observer.update(event));
    }
}
