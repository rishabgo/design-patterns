package DesignPatterns.ChainOfResponsibilityDesignPattern.calculator;

public interface OperationHandler {

    void setNextOperationHandler(OperationHandler operationHandler);

    void compute(OperationType operationType, Numbers numbers);
}
