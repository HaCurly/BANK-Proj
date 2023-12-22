import java.util.Scanner;

public class BankAccountManager {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for bank account details
        System.out.print("Enter the account name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the account number: ");
        String number = scanner.nextLine();
        System.out.print("Enter the initial balance: ");
        double balance = scanner.nextDouble();

        // Create a bank account
        BankAccount account = new BankAccount(name, number, balance);

        // Perform operations
        performOperations(scanner, account);

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    private static void performOperations(Scanner scanner, BankAccount account) {
        char choice;

        do {
            System.out.println("\nWhat operation would you like to perform?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.print("Enter your choice (1, 2, 3): ");
            int operationChoice = scanner.nextInt();

            switch (operationChoice) {
                case 1:
                    System.out.print("Enter the deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + account.checkBalance());
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

            System.out.print("Do you want to perform another operation? (Y or N): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
    }
    }
