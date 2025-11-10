package com.avn.tns.accessdemo;

// Executor class for TypesOfVariables
public class VarMain {

    public static void main(String[] args) {

        TypesOfVariables t = new TypesOfVariables();

        // assigning and printing instance variable
        t.instanceVar = "This is instance variable data";
        System.out.println(t.instanceVar);

        // calling methods
        t.print();
        t.add();

        // accessing static variable
        System.out.println("Value of static variable pi: " + TypesOfVariables.pi);
    }
}