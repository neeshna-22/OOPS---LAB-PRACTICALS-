// Abstract class - cannot be instantiated directly
abstract class BankAccount {
    private long accountNumber;         // private
    private double balance;             // private
    protected String accountHolder;     // protected
    final double MIN_BALANCE = 500.0;   // final

    // Constructor (default access)
    BankAccount(long accNo, String name, double initialDeposit) {
        this.accountNumber = accNo;
        this.accountHolder = name;
        this.balance = initialDeposit;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    // Public method to show balance
    public void showBalance() {
        System.out.println("Balance for " + accountHolder + ": ₹" + balance);
    }

    // Protected method for internal audit
    protected void internalAudit() {
        System.out.println("Account " + accountNumber + " audited. Balance: ₹" + balance);
    }

    // Abstract method to be implemented by child class
    public abstract void withdraw(double amount);
}

// Subclass
class SavingsAccount extends BankAccount {

    // Constructor
    public SavingsAccount(long accNo, String name, double initialDeposit) {
        super(accNo, name, initialDeposit);
    }

    // Implement abstract method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= 10000) {
            System.out.println(accountHolder + " withdrawing ₹" + amount + "...");
        } else {
            System.out.println("Invalid withdrawal amount or limit exceeded.");
        }
    }

    // Default method (no modifier)
    void printAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

// Main class
public class AccessModifiersBankSystemDemo {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(1234567890L, "Ananya Sharma", 5000.0);

        acc.printAccountType();      // default access
        acc.deposit(2500.0);         // public method
        acc.withdraw(3000.0);        // public method from abstract
        acc.showBalance();           // public method

        // acc.accountNumber ❌ private, not accessible
        // acc.balance       ❌ private, not accessible

        acc.internalAudit();         // protected method
    }
}
