package DesignPatterns.StateDesignPattern.ATMMachine;

public class TestAtmMachineClient {
    public static void main(String[] args) {
        AtmMachine atmMachine = new AtmMachine(100);

        //Withdrawing amount 50
        atmMachine.insertCard();
        atmMachine.enterPin(1234);
        atmMachine.requestCash(50);

        //Incorrect Pin entered
        atmMachine.insertCard();
        atmMachine.enterPin(123);
        atmMachine.requestCash(50);

        //Not sufficient balance in atm flow
        atmMachine.insertCard();
        atmMachine.enterPin(1234);
        atmMachine.requestCash(100);

        //Withdrawing amount 50
        atmMachine.insertCard();
        atmMachine.enterPin(1234);
        atmMachine.requestCash(50);

        //Atm out of cash
        atmMachine.insertCard();
        atmMachine.enterPin(1234);
    }
}
