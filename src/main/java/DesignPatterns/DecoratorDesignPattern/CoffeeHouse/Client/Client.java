package DesignPatterns.DecoratorDesignPattern.CoffeeHouse.Client;

import DesignPatterns.DecoratorDesignPattern.CoffeeHouse.Americano;
import DesignPatterns.DecoratorDesignPattern.CoffeeHouse.Cappuccino;
import DesignPatterns.DecoratorDesignPattern.CoffeeHouse.Coffee;
import DesignPatterns.DecoratorDesignPattern.CoffeeHouse.decorator.AlmondMilk;
import DesignPatterns.DecoratorDesignPattern.CoffeeHouse.decorator.WhippedCream;

public class Client {

    public static void main(String[] args) {
        Coffee americanoCoffee = new Americano();
        System.out.println("Cost of Americano - " + americanoCoffee.calculateCost() + "$");

        Coffee almondMilkCoffee = new AlmondMilk(americanoCoffee);
        System.out.println("Cost of Americano coffee with almond milk - " + almondMilkCoffee.calculateCost() + "$");

        Coffee cappuccinoCoffee = new Cappuccino();
        System.out.println("Cost of Cappuccino - " + cappuccinoCoffee.calculateCost() + "$");

        Coffee cappuccinoWithWhippedCream = new WhippedCream(cappuccinoCoffee);
        System.out.println("Cost of cappuccino with whipped cream - " + cappuccinoWithWhippedCream.calculateCost() + "$");
    }
}
