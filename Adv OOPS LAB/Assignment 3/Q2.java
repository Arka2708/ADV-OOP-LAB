import java.util.*;

/*Q2. There are number of accounts. Each account has account number (unique), name of the account and
balance. Very frequent query is to provide the balance for an account. Other requirements are to verify
the existence of an account, adding new account and displaying all accounts.*/
class Account {
    private String accountNumber;
    private String accountName;
    private double balance;

    public Account(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public boolean verifyAccount(String accountNumber) {
        return accounts.containsKey(accountNumber);
    }

    public double getAccountBalance(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            return account.getBalance();
        }
        return -1; // Return -1 if account number is not found
    }

    public void addAccount(String accountNumber, String accountName, double balance) {
        Account account = new Account(accountNumber, accountName, balance);
        accounts.put(accountNumber, account);
    }

    public void displayAllAccounts() {
        System.out.println("All Accounts:");
        for (Account account : accounts.values()) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Name: " + account.getAccountName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("------------------");
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Adding accounts
        bank.addAccount("A1", "Account 1", 5000);
        bank.addAccount("A2", "Account 2", 10000);
        bank.addAccount("A3", "Account 3", 7500);

        // Verify existence of an account
        String accountNumber = "A2";
        if (bank.verifyAccount(accountNumber)) {
            System.out.println("Account " + accountNumber + " exists.");
        } else {
            System.out.println("Account " + accountNumber + " does not exist.");
        }

        // Get account balance
        double balance = bank.getAccountBalance(accountNumber);
        if (balance != -1) {
            System.out.println("Account " + accountNumber + " balance: " + balance);
        } else {
            System.out.println("Account " + accountNumber + " does not exist.");
        }

        // Display all accounts
        bank.displayAllAccounts();
    }
}

