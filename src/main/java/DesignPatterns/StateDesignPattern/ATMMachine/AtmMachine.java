package DesignPatterns.StateDesignPattern.ATMMachine;

public class AtmMachine {
    private final AtmState hasCardState;
    private final AtmState noCardState;
    private final AtmState hasCorrectPin;
    private final AtmState noCashState;
    private AtmState currentState;

    private Integer totalCash;

    public AtmMachine(int totalCash) {
        this.totalCash = totalCash;
        hasCardState = new HasCardState(this);
        noCardState = new NoCardState(this);
        hasCorrectPin = new HasPinState(this);
        noCashState = new NoCashState(this);
        currentState = noCardState;
        if (totalCash <= 0) {
            currentState = noCashState;
        }
    }

    public void setCurrentState(AtmState currentState) {
        this.currentState = currentState;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void enterPin(int pinCode) {
        currentState.enterPin(pinCode);
    }

    public void requestCash(int cashToWithdraw) {
        currentState.requestCash(cashToWithdraw);
    }

    public AtmState getHasCardState() {
        return hasCardState;
    }

    public AtmState getNoCardState() {
        return noCardState;
    }

    public AtmState getHasCorrectPin() {
        return hasCorrectPin;
    }

    public AtmState getNoCashState() {
        return noCashState;
    }

    public AtmState getCurrentState() {
        return currentState;
    }

    public int getTotalCash() {
        return totalCash;
    }

    public void setCashInMachine(int amount) {
        this.totalCash = amount;
    }
}
