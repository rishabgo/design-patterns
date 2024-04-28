package DesignPatterns.StateDesignPattern.ATMMachine;

public class HasPinState implements AtmState {
    private final AtmMachine atmMachine;

    public HasPinState(AtmMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card has already been inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
        atmMachine.setCurrentState(atmMachine.getNoCardState());
    }

    @Override
    public void enterPin(int pinCode) {
        System.out.println("Pin has already been entered");
    }

    @Override
    public void requestCash(int amount) {

        if (amount > atmMachine.getTotalCash()) {
            System.out.println("Cannot dispense requested amount");
            System.out.println("Card Ejected");
            atmMachine.setCurrentState(atmMachine.getNoCardState());
        } else {
            System.out.println("Dispensing amount: " + amount);
            atmMachine.setCashInMachine(atmMachine.getTotalCash() - amount);
            System.out.println("Card Ejected");
            atmMachine.setCurrentState(atmMachine.getNoCardState());

            if (atmMachine.getTotalCash() <= 0) {
                atmMachine.setCurrentState(atmMachine.getNoCashState());
            }
        }
    }
}
