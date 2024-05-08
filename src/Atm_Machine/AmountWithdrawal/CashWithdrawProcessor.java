package Atm_Machine.AmountWithdrawal;

import Atm_Machine.ATM;

public class CashWithdrawProcessor {

    CashWithdrawProcessor nextCashWithdrawProcessor;
    public CashWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor){
        this.nextCashWithdrawProcessor=nextCashWithdrawProcessor;
    }
    public void withdraw(ATM atm ,int remainingAmount){
        if(nextCashWithdrawProcessor!=null){
            nextCashWithdrawProcessor.withdraw(atm,remainingAmount);
        }
    }


}
