import java.util.Scanner;

class Account {
    String accountNumber;
    String accountHolderName;
    double balance;
    double dailyWithdrawalLimit;

    public Account(String number, String name, double initialBalance, double limit) {
        this.accountNumber = number;
        this.accountHolderName = name;
        this.balance = initialBalance;
        this.dailyWithdrawalLimit = limit;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal failed: Insufficient balance.");
        } else if (amount > dailyWithdrawalLimit) {
            System.out.println("Withdrawal failed: Exceeds daily withdrawal limit.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Display account information
    public void displayAccountInfo() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("Daily Withdrawal Limit: $" + dailyWithdrawalLimit);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter account holder's name: ");
        String accountHolderName = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        System.out.print("Enter daily withdrawal limit: ");
        double dailyWithdrawalLimit = scanner.nextDouble();

        Account acc = new Account(accountNumber, accountHolderName, initialBalance, dailyWithdrawalLimit);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Info");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    acc.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    acc.withdraw(withdrawAmount);
                    break;
                case 3:
                    acc.checkBalance();
                    break;
                case 4:
                    acc.displayAccountInfo();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}