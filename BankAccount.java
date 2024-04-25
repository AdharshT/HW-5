package com.company;
// Adharsh Thiagarajan

//To run this program check out the Main.java

// BankAccount class represents a simple bank account with account number and balance.
public class BankAccount {
    // Stores the account number
    private String accountNumber;
    // Stores the current balance
    private double balance;

    // Constructor to initialize the BankAccount with account number and initial balance.
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money into the account.
    public void deposit(double amount){
        // Increase the balance by the deposit amount
        balance += amount;
    }

    // Method to withdraw money from the account.
    // Returns true if withdrawal is successful, false otherwise (insufficient funds).
    public boolean withdraw(double amount){
        if (balance >= amount){
            // Decrease the balance by the withdrawal amount
            balance -= amount;
            // Withdrawal successful
            return true;
        }
        // Insufficient funds for withdrawal
            return false;
        }
    // Method to get the account number.
    public String getAccountNumber(){
        return accountNumber;
    }

    // Method to get the current balance of the account.
    public double getBalance(){
        return balance;
    }
}
