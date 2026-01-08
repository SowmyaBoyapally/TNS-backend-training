package com.avn.tns.abstraction;

public class BankMain {
    public static void main(String[] args) {
        Bank ob = new BankImpl();   // interface reference -> implementation (polymorphism)
        ob.greet();                 // default/overridden greet
        Bank.info();                // static method from interface

        ob.deposit(5000);           // valid deposit
        ob.withdraw(3000);          // valid withdrawal
        ob.withdraw(2000);          // may fail if min balance condition violated
        ob.deposit(30000);          // exceeds DEPOSIT_LIMIT -> error
    }

}
