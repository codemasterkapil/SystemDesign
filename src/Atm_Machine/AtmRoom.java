package Atm_Machine;

public class AtmRoom {
    User user;
    ATM atm;

    public static void main(String[] args) {
       AtmRoom atmRoom = new AtmRoom();
       atmRoom.initialize();

        atmRoom.atm.printCurrentATMStatus();
        atmRoom.atm.getCurrentATMState().insertCard(atmRoom.atm, atmRoom.user.card);
        atmRoom.atm.getCurrentATMState().authenticatePin(atmRoom.atm, atmRoom.user.card, 112211);
        atmRoom.atm.getCurrentATMState().selectOperation(atmRoom.atm, atmRoom.user.card, TransactionType.CASH_WITHDRAWAL);
        atmRoom.atm.getCurrentATMState().cashWithdrawal(atmRoom.atm, atmRoom.user.card, 2700);
        atmRoom.atm.printCurrentATMStatus();

    }

    private void initialize(){
       atm=ATM.getATMObject();
       atm.setAtmBalance(3500,1,2,5);
       this.user=createUser();
    }

    private User createUser(){
        User user=new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard(){
        Card card=new Card();
        card.setBankAccount(createBankAccount());
        return card;
    }

    private UserBankAccount createBankAccount(){
        UserBankAccount userBankAccount=new UserBankAccount();
        userBankAccount.setBalance(3000);
        return userBankAccount;
    }



}
