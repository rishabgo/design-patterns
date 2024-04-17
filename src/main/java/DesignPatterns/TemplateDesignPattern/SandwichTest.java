package DesignPatterns.TemplateDesignPattern;

public class SandwichTest {

    public static void main(String[] args) {

        Sandwich italianSandwichWithHooks = new ItalianSandwichWithHooks();
        Sandwich indianSandwichWithHooks = new IndianSandwichWithHooks();

        System.out.println("Making Italian Sandwich");
        italianSandwichWithHooks.makeSandwich();

        System.out.println("\n");

        System.out.println("Making Indian Sandwich");
        indianSandwichWithHooks.makeSandwich();
    }
}
