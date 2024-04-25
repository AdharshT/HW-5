package com.company;
// Adharsh Thiagarajan

//To run this program check out the Main.java

// WithdrawTransaction class represents a transaction to withdraw money from a bank account.
public class WithdrawTransaction implements TransactionInterface {
    // The bank account from which money will be withdrawn
    private BankAccount account;
    // The amount of money to withdraw
    private double amount;

    // Constructor to initialize a withdrawal transaction with a bank account and withdrawal amount.
    public WithdrawTransaction(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }
    // Override of the execute method from TransactionInterface.
    // Executes the withdrawal transaction by attempting to withdraw the specified amount from the bank account.
    @Override
    public void execute() {
        // Attempt to withdraw the specified amount
        boolean success = account.withdraw(amount);
        if (success) {
            System.out.println();
            System.out.println("Making a withdrawal of $"+amount + " for account:"+ account.getAccountNumber() + " was completed.");
        } else {
            System.out.println("Insufficient funds for withdrawal of $"+amount );
        }
    }
}

