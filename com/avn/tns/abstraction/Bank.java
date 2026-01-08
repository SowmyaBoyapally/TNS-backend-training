package com.avn.tns.abstraction;

public interface Bank {
    // abstract methods (implicitly public)
    void deposit(int amount);
    void withdraw(int amount);

    // final / constant variables
    double DEPOSIT_LIMIT = 25000;
    double MIN_BAL = 1000;

    // default method (available to implementing classes)
    default void greet() {
        System.out.println("Welcome customer, be a wise saver!");
    }

    // static method (callable on the interface)
    static void info() {
        System.out.println("Cannot print receipts from interface directly.");
    }

}
