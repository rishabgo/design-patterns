package DesignPatterns.DecoratorDesignPattern.MessageDecorator;

//concrete implementation of component Message
public class TextMessage implements Message {

    private final String message;

    public TextMessage(String message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return this.message;
    }
}
