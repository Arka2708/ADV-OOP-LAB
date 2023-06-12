#Q12. Create a BankAccount class. Your class should support these methods: deposit,
#withdraw, get_balance, change_pin. Create one SavingsAccount class that behaves just like
#a BankAccount class, but also has an interest rate and a method that increases the balance by
#the appropriate amount of interest. Create another FeeSavingsAccount class that behaves
#just like a SavingsAccount, but also charges a fee every time you withdraw money. The fee
#should be set in the constructor and deducted before each withdrawal.
class BankAccount:
    def __init__(self, pin):
        self.balance = 0
        self.pin = pin

    def deposit(self, amount):
        self.balance += amount
        print("Deposit of %.2f Rs successful." % amount)
        self._print_balance()

    def withdraw(self, amount):
        if amount > self.balance:
            print("Insufficient funds. Withdrawal canceled.")
        else:
            self.balance -= amount
            print("Withdrawal of %.2f Rs successful." % amount)
        self._print_balance()

    def get_balance(self):
        self._print_balance()

    def change_pin(self, new_pin):
        self.pin = new_pin
        print("PIN changed successfully.")

    def _print_balance(self):
        print("Current balance: %.2f Rs" % self.balance)


class SavingsAccount(BankAccount):
    def __init__(self, pin, interest_rate):
        super().__init__(pin)
        self.interest_rate = interest_rate

    def add_interest(self):
        interest = self.balance * self.interest_rate
        self.balance += interest
        print("Interest of %.2f Rs added to the account." % interest)
        self._print_balance()


class FeeSavingsAccount(SavingsAccount):
    def __init__(self, pin, interest_rate, withdrawal_fee):
        super().__init__(pin, interest_rate)
        self.withdrawal_fee = withdrawal_fee

    def withdraw(self, amount):
        withdrawal_amount = amount + self.withdrawal_fee
        super().withdraw(withdrawal_amount)
        if amount <= self.balance:
            print("Withdrawal fee of %.2f Rs charged." % self.withdrawal_fee)


# Example usage
# Creating a BankAccount
account1 = BankAccount("1234")
account1.deposit(1000)
account1.withdraw(500)
account1.get_balance()
account1.change_pin("4321")

# Creating a SavingsAccount
account2 = SavingsAccount("5678", 0.05)
account2.deposit(2000)
account2.withdraw(1000)
account2.get_balance()
account2.add_interest()

# Creating a FeeSavingsAccount
account3 = FeeSavingsAccount("9876", 0.03, 5)
account3.deposit(3000)
account3.withdraw(1500)
account3.get_balance()
account3.add_interest()