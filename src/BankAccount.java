public class BankAccount {
    private String name;
    private String number;
    private double balance;

    public BankAccount(String name, String number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        } else {
            System.out.println("Insufficient funds. Withdrawal not possible.");
        }
    }

      public double checkBalance() {
        return balance;
    }
}
