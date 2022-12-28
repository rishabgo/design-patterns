package DesignPatterns.DecoratorDesignPattern.CoffeeHouse;

public class Americano extends Coffee {

    public Americano() {
        this.coffeeName = "americano";
    }

    @Override
    public double calculateCost() {
        return 5;
    }
}
