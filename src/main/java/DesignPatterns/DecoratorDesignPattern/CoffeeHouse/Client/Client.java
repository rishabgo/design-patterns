package DesignPatterns.DecoratorDesignPattern.CoffeeHouse.Client;

import DesignPatterns.DecoratorDesignPattern.CoffeeHouse.Americano;
import DesignPatterns.DecoratorDesignPattern.CoffeeHouse.Cappuccino;
import DesignPatterns.DecoratorDesignPattern.CoffeeHouse.Coffee;
import DesignPatterns.DecoratorDesignPattern.CoffeeHouse.decorator.AlmondMilk;
import DesignPatterns.DecoratorDesignPattern.CoffeeHouse.decorator.WhippedCream;

public class Client {

    public static void main(String[] args) {
        Coffee americanoCoffee = new Americano();
        System.out.println("Cost of " + americanoCoffee.getCoffeeName() + " is - " + americanoCoffee.calculateCost() + "$");

        Coffee almondMilkCoffee = new AlmondMilk(americanoCoffee);
        System.out.println("Cost of " + almondMilkCoffee.getCoffeeName() + " is - " + almondMilkCoffee.calculateCost() + "$");

        Coffee cappuccinoCoffee = new Cappuccino();
        System.out.println("Cost of " + cappuccinoCoffee.getCoffeeName() + " is - " + cappuccinoCoffee.calculateCost() + "$");

        Coffee cappuccinoWithWhippedCream = new WhippedCream(cappuccinoCoffee);
        System.out.println("Cost of " + cappuccinoWithWhippedCream.getCoffeeName() + " is - " + cappuccinoWithWhippedCream.calculateCost() + "$");
    }
}
