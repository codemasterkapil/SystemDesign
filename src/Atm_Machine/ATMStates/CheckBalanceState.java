package Atm_Machine.ATMStates;

import Atm_Machine.ATM;
import Atm_Machine.Card;

public class CheckBalanceState extends ATMState{

    @Override
    public void displayBalance(ATM atm, Card card){
        System.out.println("Your Balance is: "+card.getBankBalance());
        exit(atm);
    }
    @Override
    public void exit(ATM atmObject){
        returnCard();
        atmObject.setCurrentAtmState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard(){
        System.out.println("Please collect your card");
    }


}
