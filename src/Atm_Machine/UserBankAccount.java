package Atm_Machine;

public class UserBankAccount {
    int balance=0;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdrawalBalance(int amount){
        balance=balance-amount;
    }
}
