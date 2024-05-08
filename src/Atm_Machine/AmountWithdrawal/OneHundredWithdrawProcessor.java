package Atm_Machine.AmountWithdrawal;

import Atm_Machine.ATM;

public class OneHundredWithdrawProcessor extends CashWithdrawProcessor{
    public OneHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount){

        int required_notes=remainingAmount/100;
        int balance=remainingAmount%100;

        if(required_notes<=atm.getNoOfOneHundredNotes()){
            atm.deductOneHundredNotes(required_notes);
        }else{
            balance=balance+(required_notes-atm.getNoOfOneHundredNotes())*2000;
            atm.deductOneHundredNotes(atm.getNoOfOneHundredNotes());
        }

        if(balance!=0){
            super.withdraw(atm,balance);
        }

    }
}
