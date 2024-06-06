/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288_lab1;

/**
 * This is a Simple Factory
 * @author ryany
 */
public class VehicleFactory {
    public static Vehicle createVehicle(String type, String make, String model, int year) {
        switch (type.toLowerCase()) {
            case "car":
//                return new Car(make, model, year, "V8 model", 4, 18, "Black");  // method 1
                Vehicle car = new CarBuilder().setMake(make).setModel(model).setYear(year)   // method 2
                        .buildEngine("V6 Engine").buildWheels(4, 19).buildColor("Black").build();
                return car;
            case "motorcycle":
                return new Motorcycle(make, model, year, "V4 model", 2, 12, "Red");
            default:
                throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}