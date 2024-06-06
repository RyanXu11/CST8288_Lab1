/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288_lab1;

/**
 *
 * @author ryany
 */
public class MotorcycleBuilder implements VehicleBuilder {
    private String make;
    private String model;
    private int year;
    private String engine;
    private int wheelNumber=2; // Default wheel number for a motorcycle
    private int wheelSize;
    private String color;

   /**
    * 
    * @param make
    * @return 
    */
    @Override
    public MotorcycleBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    /**
     * 
     * @param model
     * @return 
     */
    @Override
     public MotorcycleBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * 
     * @param year
     * @return 
     */ 
    @Override
    public MotorcycleBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    /**
     * 
     * @param engine
     * @return 
     */
    @Override
    public MotorcycleBuilder buildEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 
     * @param wheelNumber
     * @param wheelSize
     * @return 
     */
    @Override
    public MotorcycleBuilder buildWheels(int wheelNumber, int wheelSize) {
        this.wheelNumber = wheelNumber;
        this.wheelSize = wheelSize;
        return this;
    }

    /**
     * 
     * @param color
     * @return 
     */
    @Override
    public MotorcycleBuilder buildColor(String color) {
        this.color = color;
        return this;
    }

    /**
     * 
     * @return 
     */
    @Override
    public Motorcycle build() {
        // Construct and return a Motorcycle object with the set attributes
        return new Motorcycle(make, model, year, engine, wheelNumber, wheelSize, color);
    }
}

