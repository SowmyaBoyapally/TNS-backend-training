package com.avn.tns.abstraction;

// Demo for abstract class
// Combo of abstract methods + concrete methods
abstract public class AbstractDemo {

    // abstract method
    abstract void payment();

    // concrete method
    void print() {
        System.out.println("This is a concrete method inside AbstractDemo class.");
    }
}