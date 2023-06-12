package Q1;
//Q1. Each customer of a bank has customer ID, name, current loan amount and phone number 
//one can change the attributes like name phone number a customer may ask for a loan of certain amount.
//It is granted provided the sum of current loan amount and ask amount does not exceed 
//(credit limit fixed amount for all customer) may be a privileged amount for such customers credit limit is higher once
// a loan is sanction necessary update should be made any type of customer should be able to find his credit limit 
//current loan amount and amount of loan he can seek. Design and implement the classes.


class Customer {
    int customerId;
    String name;
    int currentLoanAmount;
    String phoneNumber;
    static int creditLimit;
    static int privilegedCreditLimit;
    boolean isPrivileged;
    public Customer(){}
    public Customer(int id, String name, int loan, String ph, boolean Privilege) {
        this.customerId = id; this.name = name; this.currentLoanAmount =loan;
        this.phoneNumber=ph; this.isPrivileged=Privilege;
    }
    static public void setCreditLimit(int normal , int privileged){
         creditLimit = normal ; privilegedCreditLimit = privileged; 
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int id) {
        this.customerId=id;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public void setPhoneNumber(String newPh){
        this.phoneNumber = newPh;
    }
    public boolean isPrivileged() {
        return isPrivileged;
    }

    public void setPrivileged(boolean privileged) {
        isPrivileged = privileged;
    }

    public int getCurrentLoanAmount() {
        return currentLoanAmount;
    }

    public void setCurrentLoanAmount(int amount) {
        this.currentLoanAmount = amount;
    }
    public boolean requestLoan(int requestedLoanAmount,boolean isPrivileged) {
        if(!isPrivileged){
        if (currentLoanAmount + requestedLoanAmount <= creditLimit) {
            currentLoanAmount += requestedLoanAmount;
            return true;
        } else {
            return false;
        }
    }
    if (currentLoanAmount + requestedLoanAmount <= privilegedCreditLimit) {
        currentLoanAmount += requestedLoanAmount;
        return true;
    } else {
        return false;
    }
    }
    public void printLoanInformation() {
        if(isPrivileged()) System.out.println("Privileged Customer ");
         else System.out.println("Standard Customer ");
        System.out.println("Name: " + name);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Credit Limit: " + creditLimit);
        System.out.println("Current Loan Amount: " + currentLoanAmount);
    }
}

class BankManager {
    public static void main(String[] args) {
        System.out.println("First Customer:-");
        Customer C = new Customer();
        Customer.setCreditLimit(5000,10000);
        C.setCurrentLoanAmount(5000);

        C.setName("Akash");
        C.setPhoneNumber("9898445145");
        C.setCustomerId(5435);
        C.setPrivileged(true);
        if (C.requestLoan(5000,C.isPrivileged())) {
            System.out.println("Loan approved.");
        } else {
            System.out.println("Loan denied.");
        }
        C.printLoanInformation();
        System.out.println("");
        System.out.println("Second Customer:-");
      Customer A= new Customer(6541, "Arka", 6500, "654654511", false);
        if (A.requestLoan(5000,A.isPrivileged())) {
            System.out.println("Loan approved.");
        } else System.out.println("Loan denied.");
        A.printLoanInformation();
    }
}

