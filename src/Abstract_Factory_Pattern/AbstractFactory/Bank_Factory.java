package Abstract_Factory_Pattern.AbstractFactory;
import Abstract_Factory_Pattern.Abstract_Bank.Bank;
import Abstract_Factory_Pattern.Abstract_Bank.HDFC;
import Abstract_Factory_Pattern.Abstract_Bank.ICICI;
import Abstract_Factory_Pattern.Abstract_loan.Loan;

public class Bank_Factory extends AbstractFactory{
    public Bank getBank(String Name){
        switch(Name){
            case "HDFC":
                return new HDFC(Name);
            case "ICICI":
                return new ICICI(Name);
        }
        return null;
    }

    public Loan getLoan(String Name){
        return null;
    }
}
