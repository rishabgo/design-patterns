package DesignPatterns.AdapterDesignPattern.adapter;

import DesignPatterns.AdapterDesignPattern.WeightMachine;
import DesignPatterns.AdapterDesignPattern.WeightMachineImpl;

public class WeightMachineAdapter implements WeightMachine {

    private final WeightMachine weightMachine;

    public WeightMachineAdapter(WeightMachineImpl weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInPounds() {
        return weightMachine.getWeightInPounds() * 0.45;
    }
}
