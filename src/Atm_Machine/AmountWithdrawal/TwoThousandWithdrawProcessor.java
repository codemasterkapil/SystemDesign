package Atm_Machine.AmountWithdrawal;

import Atm_Machine.ATM;

public class TwoThousandWithdrawProcessor extends CashWithdrawProcessor{
    public TwoThousandWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount){

        int required_notes=remainingAmount/2000;
        int balance=remainingAmount%2000;

        if(required_notes<=atm.getNoOfTwoThousandNotes()){
            atm.deductTwoThousandNotes(required_notes);
        }else{
            balance=balance+(required_notes-atm.getNoOfTwoThousandNotes())*2000;
            atm.deductTwoThousandNotes(atm.getNoOfTwoThousandNotes());
        }

        if(balance!=0){
            super.withdraw(atm,balance);
        }

    }

}
