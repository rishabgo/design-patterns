package DesignPatterns.DecoratorDesignPattern.ShoppingCart;

public class TypeCouponDecorator extends CouponDecorator {

    private Product product;

    @Override
    public double getPrice() {
        return 0;
    }
}
