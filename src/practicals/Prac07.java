package practicals;
import java.util.Date;
import java.util.Scanner;

class BankAccount {
    protected String accountHolderName;
    protected String branch;
    protected double balance;
    protected double openingBalance;
    protected Date openingDate;
    protected double interestRate;

    public BankAccount(String accountHolderName, String branch, double openingBalance, double interestRate) {
        this.accountHolderName = accountHolderName;
        this.branch = branch;
        this.openingBalance = openingBalance;
        this.balance = openingBalance;
        this.openingDate = new Date();
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayBalance();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal: $" + amount);
        } else {
            System.out.println("Insufficient funds for withdrawal");
        }
        displayBalance();
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double withdrawalLimit;
    private double minBalance;

    public SavingsAccount(String accountHolderName, String branch, double openingBalance, double interestRate,
                          double withdrawalLimit, double minBalance) {
        super(accountHolderName, branch, openingBalance, interestRate);
        this.withdrawalLimit = withdrawalLimit;
        this.minBalance = minBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal limit exceeded. Maximum withdrawal limit is $" + withdrawalLimit);
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal");
        } else if (balance - amount < minBalance) {
            System.out.println("Withdrawal not allowed. Minimum balance requirement not met.");
        } else {
            balance -= amount;
            System.out.println("Savings Account Withdrawal: $" + amount);
            displayBalance();
        }
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalFee;
    private double creditLimit;

    public CheckingAccount(String accountHolderName, String branch, double openingBalance, double interestRate,
                           double withdrawalFee, double creditLimit) {
        super(accountHolderName, branch, openingBalance, interestRate);
        this.withdrawalFee = withdrawalFee;
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance + creditLimit) {
            System.out.println("Exceeds available balance and credit limit");
        } else if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal");
        } else {
            balance -= amount + withdrawalFee;
            System.out.println("Checking Account Withdrawal: $" + amount + " (including $" + withdrawalFee + " fee)");
            displayBalance();
        }
    }
}


public class Prac07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Account Holder Name:");
        String accountHolderName = scanner.nextLine();

        System.out.println("Enter Branch:");
        String branch = scanner.nextLine();

        BankAccount account = null;

        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Checking Account");

        int accountTypeChoice = scanner.nextInt();

        switch (accountTypeChoice) {
            case 1:
                System.out.println("Enter initial balance for Savings Account:");
                double openingBalanceForSavings = scanner.nextDouble();
                System.out.println("Enter interest rate for Savings Account:");
                double interestRateForSavings = scanner.nextDouble();
                System.out.println("Enter withdrawal limit for Savings Account:");
                double withdrawalLimitForSavings = scanner.nextDouble();
                System.out.println("Enter minimum balance for Savings Account:");
                double minBalanceForSavings = scanner.nextDouble();
                account = new SavingsAccount(accountHolderName, branch, openingBalanceForSavings,
                        interestRateForSavings, withdrawalLimitForSavings, minBalanceForSavings);
                break;

            case 2:
                System.out.println("Enter initial balance for Checking Account:");
                double openingBalanceForChecking = scanner.nextDouble();
                System.out.println("Enter interest rate for Checking Account:");
                double interestRateForChecking = scanner.nextDouble();
                System.out.println("Enter withdrawal fee for Checking Account:");
                double withdrawalFeeForChecking = scanner.nextDouble();
                System.out.println("Enter credit limit for Checking Account:");
                double creditLimitForChecking = scanner.nextDouble();
                account = new CheckingAccount(accountHolderName, branch, openingBalanceForChecking,
                        interestRateForChecking, withdrawalFeeForChecking, creditLimitForChecking);
                break;

            default:
                System.out.println("Invalid choice. Exiting program.");
                System.exit(0);
        }

        int choice;
        do {
            System.out.println("\nSelect Operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
