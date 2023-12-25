package Account;

import java.util.Scanner;

public class AccountTest {

    static final int DEBIT_FROM_ACCOUNT = 1;
    static final int DEPOSIT_FROM_ACCOUNT = 2;
    static final int DISPLAY_ACCOUNT_BALANCE = 3;
    static final int EXIT = 4;

    static Scanner scannerObject = new Scanner(System.in);

    static int displayChoices(){

        

        System.out.println("1.] Debit from Account");
        System.out.println("2.] Deposit into Account");
        System.out.println("3.] Display Account Balance");
        System.out.println("4.] Exit");

        System.out.println();
        System.out.print("Enter your choice: ");
        int choice =  scannerObject.nextInt();

        System.out.println();
        return choice;
    }



    public static void main(String[] args) {

        Account myAccount = new Account();
        
        while(true)
        {
            int choice = displayChoices();

            switch (choice) {
                case DEBIT_FROM_ACCOUNT:
                    System.out.println("Enter debit amount: ");       
                    double debitAmount = scannerObject.nextDouble();
                    myAccount.debit(debitAmount);
                    
                    break;
                case DEPOSIT_FROM_ACCOUNT:
                    System.out.println("Enter credit amount: ");       
                    double creditAmount = scannerObject.nextDouble();
                    myAccount.credit(creditAmount);

                    break;
                case DISPLAY_ACCOUNT_BALANCE: 
                    myAccount.displayBalance();

                    break;
                case EXIT:
                    scannerObject.close();
                    break;
            }
        }
    }
}
