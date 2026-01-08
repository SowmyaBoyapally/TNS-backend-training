package com.avn.tns.abstraction;

public class BankImpl implements Bank {

    double balance = 1000; // starting balance

    @Override
    public void deposit(int amount) {
        if (amount <= DEPOSIT_LIMIT) {
            balance = amount + balance;
            System.out.println("Deposited: " + amount + " | New balance: " + balance);
        } else {
            System.err.println("Exceeds the limit: " + DEPOSIT_LIMIT);
        }
    }

    @Override
    public void withdraw(int amount) {
        // ensure minimum balance remains after withdrawal
        if (balance - amount >= MIN_BAL) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount + " | New balance: " + balance);
        } else {
            System.err.println("Insufficient balance (min required after withdrawal: " + MIN_BAL + ")");
        }
    }

    // optional: override default greet if you want a custom message
    @Override
    public void greet() {
        System.out.println("Hello! BankImpl says: Welcome, please choose an option.");
    }
}