package Atm_Machine.ATMStates;
import Atm_Machine.ATM;
import Atm_Machine.AmountWithdrawal.CashWithdrawProcessor;
import Atm_Machine.AmountWithdrawal.FiveHundredWithdrawProcessor;
import Atm_Machine.AmountWithdrawal.OneHundredWithdrawProcessor;
import Atm_Machine.AmountWithdrawal.TwoThousandWithdrawProcessor;
import Atm_Machine.Card;

public class CashWithdrawalState extends ATMState{

    public CashWithdrawalState(){
        System.out.println("Please enter the withdrawal amount");
    }
    public void cashWithdrawal(ATM atmObject, Card card, int withdrawalAmountRequest){
         if(withdrawalAmountRequest>atmObject.getAtmBalance()){
             System.out.println("insufficient fund in the bank balance");
             exit(atmObject);
         }else if(withdrawalAmountRequest>card.getBankBalance()){
             System.out.println("insufficient fund in your account");
             exit(atmObject);
         }else{
             card.deductBankBalance(withdrawalAmountRequest);
             atmObject.deductATMBalance(withdrawalAmountRequest);

             CashWithdrawProcessor withdrawProcessor=new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));
             withdrawProcessor.withdraw(atmObject,withdrawalAmountRequest);

             exit(atmObject);
         }
    }
    @Override
    public void exit(ATM atmObject) {
        returnCard();
        atmObject.setCurrentAtmState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

}
