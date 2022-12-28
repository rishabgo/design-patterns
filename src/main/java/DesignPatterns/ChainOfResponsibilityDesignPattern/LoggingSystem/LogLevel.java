package DesignPatterns.ChainOfResponsibilityDesignPattern.LoggingSystem;

public enum LogLevel {

    DEBUG("Debug"), INFO("Info"), ERROR("Error");

    String loglevel;

    LogLevel(String loglevel) {
        this.loglevel = loglevel;
    }

    public String getLogLevel() {
        return loglevel;
    }
}
