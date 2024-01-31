package Abstract_Factory_Pattern.Abstract_Bank;

public abstract class Bank {
    String Name;
    Bank(String name){
        this.Name=name;
    }
    public abstract String getBankName();
}
