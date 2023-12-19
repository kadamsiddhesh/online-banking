package oops;

import java.util.Scanner;

class BankAccount {
    private double balance;
    String name;
    String accholder;
    int accnum;
    double depamt;
    double withamt;
    String transactions;
  
    public BankAccount(String accholder) {
    	this.accholder=accholder;
    }

public String getaccholder() {
	return accholder;
}
    public void deposit(double depamt) {
    	 balance =balance+depamt;
    	 transactions = "Deposited Rs." + depamt;
        System.out.println("Deposited Rs." + depamt + ".");
    }
    public void withdraw(double withamt) {
        if (balance >= withamt) {
            balance =balance-withamt;
            transactions= "Withdraw Rs" + withamt;
            System.out.println("Withdraw Rs" + withamt + ".");
        } 
        else {
            System.out.println("Insufficient funds!");
        }
    }
    public void checkBalance() {
        System.out.println("Your balance is Rs." + balance);
    }
    public void transaction() {
    	System.out.println("Transaction History:");
    	 System.out.println(transactions);
    }
}


public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome....");
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter Account Holder name: ");
        String accholder = sc.nextLine();
        
        System.out.print("Enter Account number: ");
        int accnum=sc.nextInt();

    	BankAccount bank = new BankAccount(accholder);
        int choice;
 
        while (true) {
        	System.out.println("");
            System.out.println("Welcome "+ bank.getaccholder()+"!");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Check Bank Balance");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Transactions");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");   

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depamt = sc.nextDouble();
                    bank.deposit(depamt);
                    break;
                case 2:
                	bank.checkBalance();
                    break;
                case 3:
                	System.out.print("Enter the amount to withdraw: ");
                    double withamt = sc.nextDouble();
                    bank.withdraw(withamt);
                    break;
                case 4:
                  	bank.transaction();
                	break;
                case 5:
                	System.out.println("Thank you.... !");
                 sc.close();
                 System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
	}

}
