package DesignPatterns.TemplateDesignPattern;

import java.util.stream.Stream;

public class IndianSandwichWithHooks extends Sandwich {
    String[] condimentsUsed = {"Oil", "Vinegar"};
    String[] veggiesUsed = {"Lettuce", "Tomatoes", "Pepper", "Olive"};

    @Override
    public void addVeggies() {
        System.out.println("Adding veggies: ");
        Stream.of(veggiesUsed).forEach(e -> System.out.print(e + " "));
        System.out.print("\n");
    }

    @Override
    public void addCondiments() {
        System.out.print("Adding condiments: ");
        Stream.of(condimentsUsed).forEach(e -> System.out.print(e + " "));
        System.out.print("\n");
    }

    @Override
    public void addMeat() {
    }

    @Override
    public boolean wantVeggies() {
        return true;
    }

    @Override
    public boolean wantCondiments() {
        return true;
    }
}
