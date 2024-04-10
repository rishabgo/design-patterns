package DesignPatterns.ObserverDesignPattern.StoreObserver;

public class MessageListener implements Observer {

    private final String userName;

    public MessageListener(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(Event event) {
        //sending message to observer
        System.out.println("Sending message to customer " + userName + " for Event " + event);
    }
}
