package Adapter_Design_Pattern;

import Adapter_Design_Pattern.Adaptee.BabyMachine;
import Adapter_Design_Pattern.Adapter.AdapterInterface;
import Adapter_Design_Pattern.Adapter.WeightInKg;

public class Client {
    public static void main(String[] args) {
        AdapterInterface machine=new WeightInKg(new BabyMachine());
        System.out.println(machine.poundsToKg());
    }
}
