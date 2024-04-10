package DesignPatterns.DecoratorDesignPattern.ShoppingCart;

public abstract class Product {
    protected String name;
    protected double price;
    protected ProductType productType;

    public Product() {}

    public Product(String name, double price, ProductType productType) {
        this.name = name;
        this.price = price;
        this.productType = productType;
    }

    public abstract double getPrice();
}
