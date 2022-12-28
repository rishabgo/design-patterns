package DesignPatterns.DecoratorDesignPattern.CoffeeHouse;

public class Cappuccino extends Coffee {

    public Cappuccino() {
        this.coffeeName = "cappuccino";
    }

    @Override
    public double calculateCost() {
        //3$ charge for cappuccino
        return 3;
    }
}
