package com.arkajyoti;
//Design a BankAcct class with account number, balance and interest rate as attribute.
// Interest rate is same for all account.
// Support must be there to initialize, change and display the interest rate.
// Also supports are to be there to return balance and calculate interest.

public class BankAcct {
    int account_number;
    double balance;
    static double interest_rate;

    public BankAcct(int acctNumber, double balance) {
        this.account_number = acctNumber;
        this.balance = balance;
    }

    public static void setInterestRate(double rate) {
        interest_rate = rate;
    }
    public static double getInterestRate() {
        return interest_rate;
    }
    // Methods to return balance and calculate interest
    public double getBalance() {
        return balance;
    }

    public double calculateInterest() {
        return balance * interest_rate;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + account_number);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interest_rate);
    }

}
