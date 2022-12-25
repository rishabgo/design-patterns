package DesignPatterns.ObserverDesignPattern.OrderObserver.Observable;

import DesignPatterns.ObserverDesignPattern.OrderObserver.Observer.Observer;

import java.util.ArrayList;
import java.util.List;


public class Order {


    private String orderId;
    private int itemQuantity;
    private double totalPrice;
    private double discount;
    private double shippingCost;

    private final List<Observer> observerList = new ArrayList<>();

    public void addItem(double price) {
        totalPrice += price;
        itemQuantity++;
        updateObservers();
    }

    public double getTotal() {
        return totalPrice - discount + shippingCost;
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void updateObservers() {

        for (Observer observer : observerList) {
            observer.update(this);
        }
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", itemQuantity=" + itemQuantity +
                ", totalPrice=" + totalPrice +
                ", discount=" + discount +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
