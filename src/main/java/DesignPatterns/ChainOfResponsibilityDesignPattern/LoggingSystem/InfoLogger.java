package DesignPatterns.ChainOfResponsibilityDesignPattern.LoggingSystem;

public class InfoLogger extends Logger {

    public InfoLogger(String loglevel) {
        this.logLevel = loglevel;
    }

    @Override
    public void log(String message) {
        System.out.println("Info-" + message);
    }
}
