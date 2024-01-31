package Abstract_Factory_Pattern.Abstract_loan;

public abstract class Loan {

    int rate;
    public abstract int getInterstRate();
    public abstract int calculateLoan(int years);
}
