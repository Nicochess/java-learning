package com.nicochess;

public class Car {
    String make = "Ford";
    String model = "Caminhonete";
    int year = 2020;
    String color = "Gray";
    double price = 200_000.00;

    public void drive(){
        System.out.println("You are driving.");
    }

    public void brake(){
        System.out.println("You step the brakes.");
    }

    public String toString(){
        return make +"\n"+model+"\n"+year+"\n"+price;
    }
}
