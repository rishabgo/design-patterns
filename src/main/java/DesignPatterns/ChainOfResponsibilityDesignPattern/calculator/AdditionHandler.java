package DesignPatterns.ChainOfResponsibilityDesignPattern.calculator;

public class AdditionHandler implements OperationHandler {
    private OperationHandler nextOperationHandler;

    @Override
    public void setNextOperationHandler(OperationHandler operationHandler) {
        this.nextOperationHandler = operationHandler;
    }

    @Override
    public void compute(OperationType operationType, Numbers numbers) {
        if (operationType.equals(OperationType.ADDITION)) {
            int sum = numbers.getNumber1() + numbers.getNumber2();
            System.out.println("Addition result is: " + sum);
        } else if (nextOperationHandler != null) nextOperationHandler.compute(operationType, numbers);
        else throw new UnsupportedOperationException("Operation is not supported");
    }
}
