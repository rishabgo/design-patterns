package DesignPatterns.StateDesignPattern.ATMMachine;

public class HasCardState implements AtmState {

    private final AtmMachine atmMachine;

    public HasCardState(AtmMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("Ejecting card");
        atmMachine.setCurrentState(atmMachine.getNoCardState());
    }

    @Override
    public void enterPin(int pinCode) {

        if (pinCode == 1234) {
            System.out.println("Correct Pin");
            atmMachine.setCurrentState(atmMachine.getHasCorrectPin());
        } else {
            System.out.println("Incorrect Pin. Transaction failed");
            atmMachine.setCurrentState(atmMachine.getNoCardState());
        }

    }

    @Override
    public void requestCash(int amount) {
        System.out.println("You need to enter pin first");
    }

}
