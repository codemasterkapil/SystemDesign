package Atm_Machine.AmountWithdrawal;

import Atm_Machine.ATM;

public class FiveHundredWithdrawProcessor extends CashWithdrawProcessor{
    public FiveHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount){

        int required_notes=remainingAmount/500;
        int balance=remainingAmount%500;

        if(required_notes<=atm.getNoOfFiveHundredNotes()){
            atm.deductFiveHundredNotes(required_notes);
        }else{
            balance=balance+(required_notes-atm.getNoOfFiveHundredNotes())*500;
            atm.deductFiveHundredNotes(atm.getNoOfFiveHundredNotes());
        }

        if(balance!=0){
            super.withdraw(atm,balance);
        }

    }
}
