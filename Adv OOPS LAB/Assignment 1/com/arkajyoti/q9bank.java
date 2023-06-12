package com.arkajyoti;

//Q9. Design a BankAcct class with account number, balance and interest rate as attribute.  
//Interest rate is same for all account. Support must be there to initialize, change and display the interest rate. 
// Also supports are to be there to return balance and calculate interest.

public class q9bank {
    public static void main(String[] args) {
        // Create a bank account with initial balance of 1000
        BankAcct myAcct = new BankAcct(12345, 1000.0);

        // Display account details
        myAcct.displayDetails();

        // Change interest rate to 0.05 (5%)
        BankAcct.setInterestRate(0.05);

        // Display account details again with updated interest rate
        myAcct.displayDetails();

        // Calculate and display interest
        double interest = myAcct.calculateInterest();
        System.out.println("Interest earned: " + interest);

        // Check balance
        double balance = myAcct.getBalance();
        System.out.println("Current balance: " + balance);
    }
}
