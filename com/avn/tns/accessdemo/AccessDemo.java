package com.avn.tns.accessdemo;

public class AccessDemo {

    // Access modifiers
    public String name;
    private int contactno;
    protected String address;
    String branch; // default (no modifier)

    // Getter and Setter for private variable
    public int getContactno() {
        return contactno;
    }

    public void setContactno(int contactno) {
        this.contactno = contactno;
    }

    // Method to display message
    public void display() {
        System.out.println("Hello world!");
        System.out.println("Name: " + name);
        System.out.println("Contact No: " + contactno);
        System.out.println("Address: " + address);
        System.out.println("Branch: " + branch);
    }
}