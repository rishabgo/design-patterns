package DesignPatterns.StateDesignPattern.ATMMachine;

public interface AtmState {
    void insertCard();
    void ejectCard();
    void enterPin(int pinCode);
    void requestCash(int amount);
}
