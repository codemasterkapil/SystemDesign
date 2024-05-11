package Adapter_Design_Pattern.Adaptee;

public class MensMachine implements Machine{
    @Override
    public int calculateWeight() {
        return 50;
    }
}
