package DesignPatterns.ChainOfResponsibilityDesignPattern.LoggingSystem;

public class Client {

    public static void main(String[] args) {
        LogFactory logFactory = LogFactory.getInstance();

        //info log
        logFactory.info("Hello World!");

        //debug log
        logFactory.debug("This is debug message");
    }
}
