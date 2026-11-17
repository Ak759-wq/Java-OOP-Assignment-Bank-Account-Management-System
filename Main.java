
class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(101, "Aditya", 5000);
        BankAccount acc2 = new BankAccount(102, "Rahul", 8000);

        System.out.println("----- Account 1 -----");
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.checkBalance();
        acc1.displayDetails();

        System.out.println("\n----- Account 2 -----");
        acc2.deposit(3000);
        acc2.withdraw(2000);
        acc2.checkBalance();
        acc2.displayDetails();
    }
}
