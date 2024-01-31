package Abstract_Factory_Pattern.AbstractFactory;

import Abstract_Factory_Pattern.Abstract_Bank.Bank;
import Abstract_Factory_Pattern.Abstract_Bank.HDFC;
import Abstract_Factory_Pattern.Abstract_Bank.ICICI;
import Abstract_Factory_Pattern.Abstract_loan.Education_loan;
import Abstract_Factory_Pattern.Abstract_loan.Home_loan;
import Abstract_Factory_Pattern.Abstract_loan.Loan;

import javax.lang.model.element.Name;

public class Loan_Factory extends AbstractFactory{
    public  Bank getBank(String Name)
    {
        return null;
    }
    public  Loan getLoan(String Name)
    {
        switch(Name)
        {
            case "Home_loan":
                return new Home_loan(10);
            case "Education_loan":
                return new Education_loan(5);
        }
        return null;
    }
}
