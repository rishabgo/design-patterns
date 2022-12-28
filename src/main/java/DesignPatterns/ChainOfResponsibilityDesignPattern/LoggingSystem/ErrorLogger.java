package DesignPatterns.ChainOfResponsibilityDesignPattern.LoggingSystem;

public class ErrorLogger extends Logger {

    public ErrorLogger(String loglevel) {
        this.logLevel = loglevel;
    }

    @Override
    public void log(String message) {
        System.out.println("Error-" + message);
    }
}
