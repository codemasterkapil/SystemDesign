package Abstract_Factory_Pattern.Factory_Creator;

import Abstract_Factory_Pattern.AbstractFactory.AbstractFactory;
import Abstract_Factory_Pattern.AbstractFactory.Bank_Factory;
import Abstract_Factory_Pattern.AbstractFactory.Loan_Factory;

public class Creator {
    public static AbstractFactory getFactory(String name){
        switch(name){
            case("Bank"):
                return new Bank_Factory();
            case("Loan"):
                return new Loan_Factory();
        }
        return null;
    }
}
