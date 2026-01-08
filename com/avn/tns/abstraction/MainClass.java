package com.avn.tns.abstraction;

public class MainClass {
     public static void main(String[] args) {
        AbstractDemo obj = new AbstractImpl(); // Upcasting
        obj.payment();  // Calls overridden method
        obj.print();    // Calls concrete method from AbstractDemo
    }

}
