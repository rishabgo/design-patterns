package DesignPatterns.StateDesignPattern.ATMMachine;

public class NoCardState implements AtmState {

    private final AtmMachine atmMachine;

    public NoCardState(AtmMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        //Transition to next state
        System.out.println("Please enter pin");
        atmMachine.setCurrentState(atmMachine.getHasCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("No card inserted");
    }

    @Override
    public void enterPin(int pinCode) {
        System.out.println("First Enter card to start transaction");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("First Enter card to start transaction");
    }
}
