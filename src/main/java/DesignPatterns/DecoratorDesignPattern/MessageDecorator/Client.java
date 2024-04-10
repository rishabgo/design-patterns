package DesignPatterns.DecoratorDesignPattern.MessageDecorator;

public class Client {

    public static void main(String[] args) {
        Message message = new TextMessage("Hello world");
        System.out.println(message.getContent());

        Message decorator = new Base64EncodedMessage(message);
        System.out.println(decorator.getContent());
    }
}
