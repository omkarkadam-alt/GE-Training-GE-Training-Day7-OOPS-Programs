package Account;

public class Account {

    static final double INITIAL_BALANCE = 0;

    double balance;

    Account(){
        balance = INITIAL_BALANCE;
    }

    void credit(double creditAmount){
        this.balance += creditAmount;
        System.out.println("Credited " + creditAmount + " to the account.");
        System.out.println("Current Balance: " + this.balance);
        System.out.println();
    }

    void debit(double debitAmount){
        if(debitAmount > this.balance){
            System.out.println("Debit Amount exceeded Account Balance, Transaction unsuccessful.");
            System.out.println();
        }else{
            this.balance -= debitAmount;
            System.out.println("Debited " + debitAmount + " from the account.");
            System.out.println("Current Balance: " + this.balance);
            System.out.println();
        }
    }

    void displayBalance(){
        System.out.println("Current Balance: " + this.balance);
        System.out.println();
    }
    
}
