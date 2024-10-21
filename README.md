# Banking System

This is a simple banking system simulation implemented in Java. The program allows users to create an account, deposit money, withdraw money, check their balance, and display account information. The program also enforces a daily withdrawal limit and checks for insufficient funds during withdrawals.

## Features
- **Create Account**: Input account number, holder's name, initial balance, and daily withdrawal limit.
- **Deposit**: Add money to the account balance.
- **Withdraw**: Withdraw money from the account, ensuring the amount doesn't exceed the balance or the daily withdrawal limit.
- **Check Balance**: View the current account balance.
- **Display Account Info**: See the account details like account number, holder's name, balance, and daily withdrawal limit.

## How to Run

1. Clone the repository or download the source code.
2. Compile and run the `BankingSystem` class in your Java IDE or from the command line.

### Command Line Execution
1. Open a terminal or command prompt.
2. Navigate to the folder containing the source code.
3. Compile the program:
    ```bash
    javac BankingSystem.java
    ```
4. Run the program:
    ```bash
    java BankingSystem
    ```

## Program Flow
1. When the program starts, the user is prompted to enter their account number, account holder's name, initial balance, and daily withdrawal limit.
2. The user is then presented with the following menu options:
    - Deposit money into the account.
    - Withdraw money from the account (subject to daily withdrawal limit).
    - Check the account balance.
    - Display all account information.
    - Exit the program.
3. The user can perform actions until they choose to exit the program.

## Code Structure

- `Account`: A class representing a bank account, with properties like `accountNumber`, `accountHolderName`, `balance`, and `dailyWithdrawalLimit`. The class provides methods for depositing, withdrawing, checking balance, and displaying account information.
  
- `BankingSystem`: The main class that contains the `main` method, which drives the program's menu and handles user input.

## Example Usage

```bash
Enter account number: 123456789
Enter account holder's name: John Doe
Enter initial balance: 1000.00
Enter daily withdrawal limit: 500.00

Choose an option:
1. Deposit
2. Withdraw
3. Check Balance
4. Display Account Info
5. Exit