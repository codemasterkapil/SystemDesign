package Atm_Machine.ATMStates;

import Atm_Machine.ATM;
import Atm_Machine.Card;
import Atm_Machine.TransactionType;

public class SelectOperationState extends ATMState{
    SelectOperationState(){
        showOperations();
    }
    @Override
    public void selectOperation(ATM atmObject, Card card,TransactionType txnType){
          switch(txnType){

              case CASH_WITHDRAWAL:
                  atmObject.setCurrentAtmState(new CashWithdrawalState());
                  break;
              case BALANCE_CHECK:
                  atmObject.setCurrentAtmState(new CheckBalanceState());
                  break;
              default: {
                  System.out.println("Invalid Option");
                  exit(atmObject);
              }

          }
    }
    @Override
    public void exit(ATM atm){
        returnCard();
        atm.setCurrentAtmState(new IdleState());
        System.out.println("Exit happens");
    }
    @Override
    public void returnCard(){
        System.out.println("Please collect your card");
    }
    private void showOperations(){
        System.out.println("Please select the operation");
        TransactionType.showAllTransactionTypes();
    }

}
