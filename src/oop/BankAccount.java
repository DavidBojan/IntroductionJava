package oop;
// oop = object-oriented programming

public class BankAccount {
    // back

    // class = code logic like a blueprint
    // example: class Car

    // object = instance of a class
    // example: Subaru

    // fields = properties/ attributes
    // example: colour, make, model, price

    // methods = actions done by the object
    // example: accelerate(), brake()

    String AccountOwner;
    String iban;
    double balance;
    boolean active = false;
    private int pin = 7777;
    int activation_trials = 0;

    // constructor = has the role to impose starting data
    // required fields

    public BankAccount(String accountOwner, String iban) {
        this.AccountOwner = accountOwner;
        this.iban = iban;
    }

    // methods
    public void AccountDetails(){
        System.out.println("Account owener: " + this.AccountOwner);
        System.out.println("IBAN: " + this.iban);
        System.out.println("Balance: " + this.balance);
        System.out.println("Status: " + this.active);
        System.out.println("PIN typed wrong: " + this.activation_trials);
        System.out.println("------------------");
    }

    public void AccountActivation(int userPin){
        // modify status to active
        if (userPin == this.pin){
            this.active = true;
            System.out.println("Account activated.");
        }else {
            System.out.println("Wrong PIN number");
            this.activation_trials++;
        }
    }

    public void AccountDeposit(double cash_deposited){
        // add cash to the current balance
        this.balance+= cash_deposited;
        System.out.println("Cash deposited successfully. Balance: " + this.balance);

    }

    public void DebitingAccount(double cash_debited){
        System.out.println("Hello, " + this.AccountOwner);
        // spent only is balance allows
        if (cash_debited <= this.balance){
            this.balance-= cash_debited;
            System.out.println("Cash amount debited: " + cash_debited + ". Balance: " + this.balance);
        }else {
            System.out.println("Insufficient funds.");
        }
    }
}
