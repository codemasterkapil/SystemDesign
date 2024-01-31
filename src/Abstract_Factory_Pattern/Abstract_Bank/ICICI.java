package Abstract_Factory_Pattern.Abstract_Bank;

public class ICICI extends Bank{

    public ICICI(String name) {
        super(name);
    }

    public String getBankName(){
        return "ICICI";
    }
}
