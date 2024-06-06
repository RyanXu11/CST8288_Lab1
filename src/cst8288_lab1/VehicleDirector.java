/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288_lab1;

/**
 * VehicleDirector
 * @author ryany
 */
public class VehicleDirector {

    /**
     * attribute
     */
    private VehicleBuilder builder;

    /**
     * Constructor
     * @param builder 
     */
    public VehicleDirector(VehicleBuilder builder) {
        this.builder = builder;
    }

    /**
     * the construct method
     * @param make
     * @param model
     * @param year
     * @param engine
     * @param wheelNumber
     * @param wheelSize
     * @param color
     * @return 
     */
    public Vehicle construct(String make, String model, int year, String engine, int wheelNumber, int wheelSize, String color) {
        return builder
            .setMake(make)
            .setModel(model)
            .setYear(year)
            .buildEngine(engine)
            .buildWheels(wheelNumber, wheelSize)
            .buildColor(color)
            .build();
    }  
}
