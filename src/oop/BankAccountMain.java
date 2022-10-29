package oop;

public class BankAccountMain {
    public static void main(String[] args) {
        // front

        // initialize an object of type BankAccount
        // instance of class BankAccount
        BankAccount account1 = new BankAccount("Morgan", "RO50REL123423412");
        BankAccount account2 = new BankAccount("Amber", "RO50REL2346255665");
        // call description method
//        account1.AccountDetails();
//        account2.AccountDetails();
        // call activation method
        account1.AccountActivation(7777);
        account1.AccountDeposit(1000.24);
        account1.DebitingAccount(350);
        account1.AccountDetails();
        account2.AccountActivation(8888);
        account2.AccountActivation(1234);
        account2.AccountActivation(7777);
        account2.AccountDeposit(742.99);
        account2.DebitingAccount(800);
        account2.DebitingAccount(500);
        account2.AccountDetails();

    }
}
