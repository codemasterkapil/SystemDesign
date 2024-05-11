package Adapter_Design_Pattern.Adaptee;

public class BabyMachine implements Machine{
    @Override
    public int calculateWeight() {
        return 20;
    }
}
