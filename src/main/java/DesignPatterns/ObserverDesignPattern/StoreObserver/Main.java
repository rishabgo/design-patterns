package DesignPatterns.ObserverDesignPattern.StoreObserver;

public class Main {

    public static void main(String[] args) {
        Store store = new Store(new NotificationService());

        store.getNotificationService().registerObserver(Event.SALE, new EmailListener("Rishabh"));
        store.getNotificationService().registerObserver(Event.NEW_ITEM, new EmailListener("Arush"));
        store.getNotificationService().registerObserver(Event.NEW_ITEM, new MessageListener("Zoe"));

        store.saleNotification();
        store.newItemPromotionNotification();
    }
}
