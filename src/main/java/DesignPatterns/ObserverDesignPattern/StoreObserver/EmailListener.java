package DesignPatterns.ObserverDesignPattern.StoreObserver;

public class EmailListener implements Observer {

    private final String username;

    public EmailListener(String username) {
        this.username = username;
    }

    @Override
    public void update(Event event) {
        //send email notification to customer
        System.out.println("Sending email to customer " + username + " for Event " + event);
    }
}
