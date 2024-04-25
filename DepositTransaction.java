package com.company;
// Adharsh Thiagarajan


//To run this program check out the Main.java

// DepositTransaction class represents a transaction to deposit money into a bank account.
public class DepositTransaction implements TransactionInterface {
    // The bank account where the deposit will be made
    private BankAccount account;
    // The amount of money to deposit
    private double amount;

    // Constructor to initialize a deposit transaction with a bank account and deposit amount.
    public DepositTransaction(BankAccount account, double amount){
        this.account = account;
        this.amount = amount;

    }
    // Override of the execute method from TransactionInterface.
    // Executes the deposit transaction by depositing the specified amount into the bank account.
    @Override
    public void execute() {
        account.deposit(amount);
        System.out.println();
        System.out.println("Making a deposit of $"+ amount + " into account:"+ account.getAccountNumber() + " was completed.");
        System.out.println();

    }
}
