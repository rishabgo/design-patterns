package DesignPatterns.ChainOfResponsibilityDesignPattern.calculator;

public final class Numbers {

    private final int number1, number2;

    public Numbers(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }
}
