package Adapter_Design_Pattern.Adapter;

import Adapter_Design_Pattern.Adaptee.BabyMachine;
import Adapter_Design_Pattern.Adaptee.Machine;

public class WeightInKg implements AdapterInterface{
    Machine machine=new BabyMachine();

    public WeightInKg(Machine machine){
        this.machine=machine;
    }
    @Override
    public double poundsToKg() {
        return (double)machine.calculateWeight()*0.45;
    }
}
