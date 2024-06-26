package DesignPatterns.DecoratorDesignPattern.CoffeeHouse.decorator;

import DesignPatterns.DecoratorDesignPattern.CoffeeHouse.Coffee;

public class AlmondMilk extends Coffee {

    private final Coffee coffee;

    public AlmondMilk(Coffee coffee) {
        this.coffee = coffee;
        this.coffeeName = coffee.getCoffeeName() + " with almond milk";
    }

    @Override
    public double calculateCost() {
        return coffee.calculateCost() + 3;
    }
}
