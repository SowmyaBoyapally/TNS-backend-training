package com.avn.tns.oopsdemo;
//Demo for inheritance --> code reusability 
public class Vehicle {
    public String brand;
    public String model;

//this --> the variables are belonging to this class
//super --> the parent variables in child class
    public Vehicle(String brand, String model){
        super();
        this.brand = brand;
        this.model = model;

    }
    void startEngine(){
        System.out.println("when the engine is started the vehicle start");
    }
    
}
