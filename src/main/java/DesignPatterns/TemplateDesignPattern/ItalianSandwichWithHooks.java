package DesignPatterns.TemplateDesignPattern;

import java.util.stream.Stream;

public class ItalianSandwichWithHooks extends Sandwich {

    String[] meatUsed = {"Salami", "Ham"};
    String[] condimentsUsed = {"Oil", "Vinegar"};

    @Override
    public void addVeggies() {
    }

    @Override
    public void addCondiments() {
        System.out.print("Adding condiments: ");
        Stream.of(condimentsUsed).forEach(e -> System.out.print(e + " "));
        System.out.print("\n");
    }

    @Override
    public void addMeat() {
        System.out.print("Adding meat: ");
        Stream.of(meatUsed).forEach(e -> System.out.print(e + " "));
        System.out.print("\n");
    }

    @Override
    public boolean wantMeat() {
        return true;
    }


}
