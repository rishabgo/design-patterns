package DesignPatterns.DecoratorDesignPattern.ShoppingCart;

public class Item1 extends Product{

    public Item1(String name, double price, ProductType productType) {
        super(name, price, productType);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
