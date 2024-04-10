package DesignPatterns.DecoratorDesignPattern.CoffeeHouse.decorator;

import DesignPatterns.DecoratorDesignPattern.CoffeeHouse.Coffee;

public class WhippedCream extends Coffee {

    private final Coffee coffee;

    public WhippedCream(Coffee coffee) {
        this.coffee = coffee;
        this.coffeeName = coffee.getCoffeeName() + " with whipped cream";
    }

    @Override
    public double calculateCost() {
        return coffee.calculateCost() + 2.5;
    }
}
