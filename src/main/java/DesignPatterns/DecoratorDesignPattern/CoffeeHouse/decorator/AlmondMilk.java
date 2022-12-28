package DesignPatterns.DecoratorDesignPattern.CoffeeHouse.decorator;

import DesignPatterns.DecoratorDesignPattern.CoffeeHouse.Coffee;

public class AlmondMilk extends Coffee {

    private Coffee coffee;

    public AlmondMilk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double calculateCost() {
        return coffee.calculateCost() + 3;
    }
}
