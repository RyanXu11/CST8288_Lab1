/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cst8288_lab1;

/**
 * This is the interface of VehicleBuilder
 * @author ryany
 */
public interface VehicleBuilder {
    VehicleBuilder setMake(String make);
    VehicleBuilder setModel(String model);
    VehicleBuilder setYear(int year);
    VehicleBuilder buildEngine(String engine);
    VehicleBuilder buildWheels(int numberOfWheels, int sizeOfWheels);
    VehicleBuilder buildColor(String color);
    Vehicle build();
}
