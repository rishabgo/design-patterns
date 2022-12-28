package DesignPatterns.ChainOfResponsibilityDesignPattern.LoggingSystem;

public class LogFactory {

    private static volatile LogFactory logFactory;
    private static Logger loggerChain;

    private LogFactory() {
        if (logFactory != null) throw new IllegalStateException("Logger object already created");
    }

    public static LogFactory getInstance() {

        if (logFactory == null) {
            synchronized (LogFactory.class) {
                if (logFactory == null) {
                    logFactory = new LogFactory();
                    loggerChain = buildLoggerChain();
                }
            }
        }
        return logFactory;
    }

    private static Logger buildLoggerChain() {

        Logger infoLogger = new InfoLogger("Info");
        Logger debugLogger = new DebugLogger("Debug");
        Logger errorLogger = new ErrorLogger("Error");

        infoLogger.setLogSuccessor(debugLogger);
        debugLogger.setLogSuccessor(errorLogger);
        return infoLogger;
    }

    public void info(String message) {
        loggerChain.logMessage(LogLevel.INFO.getLogLevel(), message);
    }

    public void error(String message) {
        loggerChain.logMessage(LogLevel.ERROR.getLogLevel(), message);
    }

    public void debug(String message) {
        loggerChain.logMessage(LogLevel.DEBUG.getLogLevel(), message);
    }
}
