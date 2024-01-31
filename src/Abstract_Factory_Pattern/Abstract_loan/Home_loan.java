package Abstract_Factory_Pattern.Abstract_loan;

public class Home_loan extends Loan{
    public Home_loan(int rate){
        super.rate=rate;
    }
    public int getInterstRate(){
        return super.rate;
    };

    public int calculateLoan(int years){
        return years*rate;
    };
}
