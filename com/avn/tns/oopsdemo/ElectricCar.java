package com.avn.tns.oopsdemo;

import com.avn.tns.oopsdemo.Vehicle;

//demo for child class
public class ElectricCar extends Vehicle{
    public int batteryCapacity;

    public ElectricCar(String brand, String model, int batteryCapacity){
        //super represents parent class variables
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
    }
    public void charge(){
        System.out.println("The capacity of battery goes till 5 hours");
        
    }
}
