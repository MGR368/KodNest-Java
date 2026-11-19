package track.project;

import java.util.*;

class BankAccount {
    String accountHolder;
    String accountNumber;
    double accountBalance;

    BankAccount(String accountHolder, String accountNumber, double accountBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    void deposit(double amount) throws InvalidAmountException {
        if (amount > 0) {
            accountBalance += amount;
        } else {
            throw new InvalidAmountException();
        }
    }

    void withdraw(double amount) throws InvalidAmountException, InsufficientbalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException();
        } else if (accountBalance < amount) {
            throw new InsufficientbalanceException();
        } else {
            accountBalance -= amount;
        }
    }

    double checkBalance() {
        return accountBalance;
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);

    }

}

class InsufficientbalanceException extends Exception {
    InsufficientbalanceException() {
        super("insufficient balance");
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException() {
        super("it is invalid.... check amount");
    }

}

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accountHolder = sc.nextLine();
        String accountNumber = sc.nextLine();
        double accountBalance = sc.nextDouble();

        BankAccount ba = new BankAccount(accountHolder, accountNumber, accountBalance);

        int c = sc.nextInt();

        switch (c) {
            case 1:
                double deamount = sc.nextDouble();
                ba.display();
                try {
                    ba.deposit(deamount);
                    System.out.println("Deposit Successful");
                } catch (InvalidAmountException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                double withamount = sc.nextDouble();
                ba.display();
                try {
                    ba.withdraw(withamount);
                    System.out.println("withdrawm successful");
                } catch (InvalidAmountException | InsufficientbalanceException e) {
                    System.out.println(e.getMessage());
                }
                break;
        }
        System.out.println("Current Balance: " + ba.checkBalance());
        System.out.println("Transaction Completed");

        
    }

}
