package DesignPatterns.StateDesignPattern.ATMMachine;

public class NoCashState implements AtmState {

    private final AtmMachine atmMachine;

    public NoCashState(AtmMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("No cash in machine");
    }

    @Override
    public void ejectCard() {
        System.out.println("ATM out of cash. No card inserted");
    }

    @Override
    public void enterPin(int pinCode) {
        System.out.println("No cash in machine");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("No cash in machine");
    }
}
