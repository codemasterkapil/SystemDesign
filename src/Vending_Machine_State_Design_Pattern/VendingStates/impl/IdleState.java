package Vending_Machine_State_Design_Pattern.VendingStates.impl;

import Vending_Machine_State_Design_Pattern.Coin;
import Vending_Machine_State_Design_Pattern.Item;
import Vending_Machine_State_Design_Pattern.VendingMachine;
import Vending_Machine_State_Design_Pattern.VendingStates.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {

    public IdleState(){
        System.out.println("Currently Vending Machine is in IdleState");
    }

    public IdleState(VendingMachine vendingMachine){
        System.out.println("Currently Vending Machine is in IdleState");
        vendingMachine.setCoinList(new ArrayList<>());
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("first you need to click on insert coin button");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in idle state");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you can not choose Product in idle state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in idle state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed its an idle state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("you can not get refunded in idle state");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
       machine.getInventory().addItem(item,codeNumber);
    }
}
