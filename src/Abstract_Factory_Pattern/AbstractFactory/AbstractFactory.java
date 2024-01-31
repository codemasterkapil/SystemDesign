package Abstract_Factory_Pattern.AbstractFactory;
import Abstract_Factory_Pattern.Abstract_Bank.Bank;
import Abstract_Factory_Pattern.Abstract_loan.Loan;
public abstract class AbstractFactory {
    public abstract Bank getBank(String Name);
    public abstract Loan getLoan(String Name);
}
