package com.company;
// Adharsh Thiagarajan

import java.time.LocalDateTime;

// Main class to demonstrate bank account transactions.
public class Main {
    public static void main(String[] args) {
        // Create two bank accounts with initial balances
        BankAccount account1 = new BankAccount("123456", 2000.00);
        BankAccount account2 = new BankAccount("983265", 200.00);

        // Display original balances of both accounts
        System.out.println("Original Balance of Account:"+ account1.getAccountNumber() +" is $"+ account1.getBalance());
        System.out.println("Original Balance of Account:"+ account2.getAccountNumber() +" is $" + account2.getBalance());

        // Create a LocalDateTime instance for the transaction time
        LocalDateTime transactionTime = LocalDateTime.now();

        // Create instances of transaction commands:
        TransactionInterface withdrawAmount = new WithdrawTransaction(account1, 500.0);
        TransactionInterface depositAmount = new DepositTransaction(account2, 300.0);

        // Create BankAccountTransaction instances with appropriate parameters
        BankAccountTransaction transaction1 = new BankAccountTransaction("AT7342", transactionTime,
                "Withdrawal", 500.0, "Withdrawal from account1", account1);

        BankAccountTransaction transaction2 = new BankAccountTransaction("AT5498", transactionTime,
                "Deposit", 300.0, "Deposit into account2", account2);

        // Execute the transactions
        transaction1.executeTransaction(withdrawAmount);
        transaction2.executeTransaction(depositAmount);

        // Display account balances after transactions
        System.out.println("Account 1 Updated Balance: " + account1.getBalance());
        System.out.println("Account 2 Updated Balance: " + account2.getBalance());

    }
}