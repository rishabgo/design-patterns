package DesignPatterns.ChainOfResponsibilityDesignPattern.calculator;

public class Main {

    public static void main(String[] args) {
        Numbers numbers = new Numbers(20, 10);
        AdditionHandler additionHandler = new AdditionHandler();
        SubtractionHandler subtractionHandler = new SubtractionHandler();
        MultiplicationHandler multiplicationHandler = new MultiplicationHandler();

        additionHandler.setNextOperationHandler(subtractionHandler);
        subtractionHandler.setNextOperationHandler(multiplicationHandler);


        additionHandler.compute(OperationType.SUBTRACTION, numbers);
        additionHandler.compute(OperationType.MULTIPLICATION, numbers);
        additionHandler.compute(OperationType.DIVISION, numbers);
    }
}
