package DesignPatterns.DecoratorDesignPattern.CoffeeHouse.decorator;

import DesignPatterns.DecoratorDesignPattern.CoffeeHouse.Coffee;

public class WhippedCream extends Coffee {

    private Coffee coffee;

    public WhippedCream(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public double calculateCost() {
        return coffee.calculateCost() + 2.5;
    }
}
