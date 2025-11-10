package com.avn.tns.accessdemo;

// Demo for types of variables
public class TypesOfVariables {

    // instance variable
    String instanceVar;

    // static variable
    static float pi = 3.14f;

    // method using local variables
    void add() {
        int a = 30;   // local variable
        int b = 20;   // local variable
        int sum = a + b;
        System.out.println("Sum of a and b: " + sum);
    }

    // method to print message
    void print() {
        System.out.println("This is print() method");
    }
}