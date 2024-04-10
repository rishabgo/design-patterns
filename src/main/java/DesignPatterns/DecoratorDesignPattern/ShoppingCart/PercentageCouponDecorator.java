package DesignPatterns.DecoratorDesignPattern.ShoppingCart;

public class PercentageCouponDecorator extends CouponDecorator {

    private final Product product;
    private final int discountPercentage;

    public PercentageCouponDecorator(Product product, int discountPercentage) {
        this.product = product;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        double originalPrice = product.getPrice();
        return (originalPrice - (originalPrice * discountPercentage) / 100);
    }
}
