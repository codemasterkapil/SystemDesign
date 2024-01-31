package Abstract_Factory_Pattern.Abstract_Bank;

public class HDFC extends Bank{

    public HDFC(String name){
        super(name);
    }
    public String getBankName(){
        return "HDFC";
    }
}
