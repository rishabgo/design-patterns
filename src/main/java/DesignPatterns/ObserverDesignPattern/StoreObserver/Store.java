package DesignPatterns.ObserverDesignPattern.StoreObserver;

public final class Store {

    private final NotificationService notificationService;

    public Store(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void newItemPromotionNotification() {
        notificationService.notifyObservers(Event.NEW_ITEM);
    }

    public void saleNotification() {
        notificationService.notifyObservers(Event.SALE);
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }
}
