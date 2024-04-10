package DesignPatterns.AdapterDesignPattern;

import java.util.Random;

public class WeightMachineImpl implements WeightMachine {
    @Override
    public double getWeightInPounds() {
        Random random = new Random();
        return random.doubles(60, 90)
                .findAny()
                .getAsDouble();
    }
}
