package DesignPatterns.DecoratorDesignPattern.CoffeeHouse;

public abstract class Coffee {

    protected String coffeeName;

    public String getCoffeeName() {
        return this.coffeeName;
    }

    public abstract double calculateCost();
}
