package DesignPatterns.DecoratorDesignPattern.CoffeeHouse;

public class Cappuccino extends Coffee{

    @Override
    public double calculateCost() {
        //3$ charge for cappuccino
        return 3;
    }
}
