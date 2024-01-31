package Abstract_Factory_Pattern.Abstract_loan;

public class Education_loan extends Loan{

    public Education_loan(int rate){
        super.rate=rate;
    }
    public int getInterstRate(){
        return super.rate;
    };

    public int calculateLoan(int years){
        return years*rate;
    };


}
