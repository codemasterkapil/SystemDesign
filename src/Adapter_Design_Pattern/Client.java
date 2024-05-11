package Adapter_Design_Pattern;

import Adapter_Design_Pattern.Adaptee.BabyMachine;
import Adapter_Design_Pattern.Adaptee.MensMachine;
import Adapter_Design_Pattern.Adapter.AdapterInterface;
import Adapter_Design_Pattern.Adapter.WeightInKg;

public class Client {
    public static void main(String[] args) {
        AdapterInterface babyMachine=new WeightInKg(new BabyMachine());
        System.out.println("the weight of the baby is :: "+babyMachine.poundsToKg());
        AdapterInterface menMachine=new WeightInKg(new MensMachine());
        System.out.println("the weight of the men is ::" + menMachine.poundsToKg());
    }
}
