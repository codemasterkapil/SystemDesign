package Vending_Machine_State_Design_Pattern.VendingStates.impl;

import Vending_Machine_State_Design_Pattern.Coin;
import Vending_Machine_State_Design_Pattern.Item;
import Vending_Machine_State_Design_Pattern.VendingMachine;
import Vending_Machine_State_Design_Pattern.VendingStates.State;

import java.util.ArrayList;
import java.util.List;

public class HasMoneyState implements State {
    public HasMoneyState(){
        System.out.println("Currently Vending Machine is in HasMoneyState only");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("You need to insert coin , please do not press me");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Accepted the coin !!");
        machine.getCoinList().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you can not choose Product in HasMoney state");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in HasMoney state");
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed its an HasMoney state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount of money in the Dispense Tray !!");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoinList();
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        throw new Exception("you can not update inventory in hasMoney  state");
    }
}
