package Atm_Machine.ATMStates;

import Atm_Machine.ATM;
import Atm_Machine.Card;

public class IdleState extends ATMState{
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentAtmState(new HasCardState());
    }
}
