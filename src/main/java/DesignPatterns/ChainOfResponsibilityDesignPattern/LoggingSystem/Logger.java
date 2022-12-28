package DesignPatterns.ChainOfResponsibilityDesignPattern.LoggingSystem;

import java.util.Objects;

public abstract class Logger {

    protected Logger logger;
    protected String logLevel;

    public void setLogSuccessor(Logger logger) {
        this.logger = logger;
    }

    public void logMessage(String level, String message) {
        if (Objects.equals(this.logLevel, level)) {
            log(message);
        } else if (logger != null) {
            logger.logMessage(level, message);
        }
    }

    public abstract void log(String message);
}
