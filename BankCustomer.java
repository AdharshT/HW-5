package com.company;

// Adharsh Thiagarajan

// To run this program go to BankCustomerDriver.java

// BankCustomer class represents a bank customer with basic information.
public class BankCustomer {
    private String customerName;
    private int age;
    private String accountNumber;
    private String customerAddress;

    // Private constructor to create a BankCustomer instance with specified details.
    private BankCustomer(String customerName, int age, String customerAddress, String accountNumber){
        this.customerName = customerName;
        this.age = age;
        this.customerAddress = customerAddress;
        this.accountNumber = accountNumber;
    }
    // Getter method for retrieving the customer's name.
    public String getCustomerName(){
        return customerName;
    }
    // Getter method for retrieving the customer's age.
    public int getAge(){
        return age;
    }
    // Getter method for retrieving the customer's address.
    public String getCustomerAddress(){
        return customerAddress;
    }
    // Getter method for retrieving the customer's account number.
    public String getAccountNumber(){
        return accountNumber;
    }
    // Override of toString method to provide a string representation of the BankCustomer object.
    @Override
    public String toString(){
        return "Customer{" +
                "name = '" + customerName + '\'' +
                ", age = '" + age + '\'' +
                ", address = '" + customerAddress + '\'' +
                ", account number = '" + accountNumber +
                '}';
    }
    // BankCustomerBuilder class facilitates the creation of BankCustomer instances using a fluent builder pattern.
    public static class BankCustomerBuilder {
        private String customerName;
        private int age;
        private String customerAddress;
        private String accountNumber;

        // Method to set the customer's name during building.
        public BankCustomerBuilder buildWithName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        // Method to set the customer's age during building.
        public BankCustomerBuilder buildWithAge(int age) {
            this.age = age;
            return this;
        }
        // Method to set the customer's address during building.
        public BankCustomerBuilder buildWithAddress(String customerAddress){
            this.customerAddress = customerAddress;
            return this;
        }
        // Method to set the customer's account number during building.
        public BankCustomerBuilder buildWithAccountNumber(String accountNumber){
            this.accountNumber = accountNumber;
            return this;
        }
        // Method to construct a BankCustomer instance based on the provided builder parameters.
        public BankCustomer build(){
            return new BankCustomer(customerName, age, customerAddress, accountNumber);
        }
    }
}
