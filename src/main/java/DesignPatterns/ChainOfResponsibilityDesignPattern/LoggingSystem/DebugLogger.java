package DesignPatterns.ChainOfResponsibilityDesignPattern.LoggingSystem;

public class DebugLogger extends Logger{

    public DebugLogger(String loglevel) {
        this.logLevel = loglevel;
    }

    @Override
    public void log(String message) {
        System.out.println("Debug-" + message);
    }
}
