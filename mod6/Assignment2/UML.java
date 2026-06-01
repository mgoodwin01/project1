// This class models a simple bank account with basic operations.
public class BankAccount {

    // Private attributes (from UML)
    private String accountNumber;
    private String ownerName;
    private double balance;

    // Constructor that initializes the account (from UML)
    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;  // Increase balance
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;  // Decrease balance
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Getter method to return the current balance
    public double getBalance() {
        return balance;
    }

    // Method that returns account details as a formatted string
    public String getAccountInfo() {
        return "Account Number: " + accountNumber +
               "\nOwner: " + ownerName +
               "\nBalance: $" + balance;
    }

    // Optional main method to demonstrate usage
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", "Mavis", 500.00);

        acc.deposit(150.00);
        acc.withdraw(50.00);

        System.out.println(acc.getAccountInfo());
    }
}
