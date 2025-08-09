package com.encapsulation.java;

// BankAccount.java
public class BankAccount1 {
    // Private data members (encapsulation)
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount1(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Public getter and setter (controlled access)
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    // No setter for account number (immutable after creation)

    public double getBalance() {
        return balance;
    }

    // Business logic methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a bank account
        BankAccount1 account = new BankAccount1("Vijji Perikala", "SBIN0001234", 10000.00);

        // Display initial details
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: ₹" + account.getBalance());

        // Perform deposit and withdrawal
        account.deposit(5000);
        account.withdraw(3000);
        account.withdraw(15000); // Should show insufficient balance

        // Final balance
        System.out.println("Final Balance: ₹" + account.getBalance());
    }
}
