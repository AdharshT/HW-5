package com.company;
import java.time.LocalDateTime;

// Adharsh Thiagarajan

//To run this program check out the Main.java

// BankAccountTransaction class represents a transaction related to a bank account.
public class BankAccountTransaction {
    private String id; // A unique identifier for the transaction.
    private LocalDateTime datetime; // The date and time when the transaction occurred
    private String type; // The type of transaction (e.g., deposit, withdrawal, transfer, etc.).
    private double amount; // The amount of money involved in the transaction.
    private String description; // A brief description or note associated with the transaction.
    private String sourceAccount;// Source account for transfer transactions
    private String destinationAccount;// Destination account for transfer transactions
    private boolean status; // Indicates whether the transaction was successful or failed.
    private BankAccount account; // The user or account associated with the transaction.

    // Constructor for transactions involving a BankAccount (e.g., Deposit, Withdrawal)
    public BankAccountTransaction(String id, LocalDateTime datetime, String type, double amount, String description, BankAccount account) {
        this.id = id;
        this.datetime = datetime;
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.account = account;
        this.status = false; // Set status to false initially (transaction is pending)
    }

    public BankAccountTransaction(String id, LocalDateTime datetime, String type, double amount, String description, String sourceAccount, String destinationAccount) {
        this.id = id;
        this.datetime = datetime;
        this.type = type;
        this.amount = amount;
        this.description = description;
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        // Set status to false initially (transaction is pending)
        this.status = false;
    }

    // Method to execute a transaction by invoking the provided TransactionInterface
    public void executeTransaction(TransactionInterface transaction) {
        // Execute the transaction
        transaction.execute();
        // Update the status to true (transaction is executed)
        this.status = true;
    }

    // Getters and setters for source and destination accounts
    public String getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public String getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    // Other getters and setters as needed
    public String getId() {
        return id;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public boolean isStatus() {
        return status;
    }
}
