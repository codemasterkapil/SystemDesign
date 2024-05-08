package Atm_Machine.ATMStates;

import Atm_Machine.ATM;
import Atm_Machine.Card;

public class HasCardState extends ATMState{
    public HasCardState(){
        System.out.println("Has card state!!");
    }

    @Override
    public void authenticatePin(ATM atm , Card card , int pin){
        boolean isCorrectPinEntered=card.isCorrectPinEntered(pin);

        if(isCorrectPinEntered) {
            atm.setCurrentAtmState(new SelectOperationState());
        } else {
            System.out.println("Invalid PIN Number");
            exit(atm);
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

}
