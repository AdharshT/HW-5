package com.company;
// Adharsh Thiagarajan


// This class demonstrates the usage of BankCustomer and BankCustomerBuilder classes.
public class BankCustomerDriver {
    public static void main(String[] args) {
        // Creating a BankCustomer using the BankCustomerBuilder
        BankCustomer bankCustomer = new BankCustomer.BankCustomerBuilder()
                // Set customer's name
                .buildWithName("Adharsh Thiagarajan")
                // Set customer's age
                .buildWithAge(20)
                // Set customer's address
                .buildWithAddress("1234 IDK St. San Francisco")
                // Set customer's account number
                .buildWithAccountNumber("14326758910")
                // Build the BankCustomer object
                .build();

        // Displaying customer information
        System.out.println("Customer Name: " + bankCustomer.getCustomerName());
        System.out.println("Customer Age: " + bankCustomer.getAge());
        System.out.println("Customer Address: " + bankCustomer.getCustomerAddress());
        System.out.println("Customer Account Number: " + bankCustomer.getAccountNumber());
    }
}
