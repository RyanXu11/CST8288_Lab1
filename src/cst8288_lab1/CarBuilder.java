/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288_lab1;

/**
 * This is the CarBuilder
 * @author ryany
 */
public class CarBuilder implements VehicleBuilder {
    private String make;
    private String model;
    private int year;
    private String engine;
    private int wheelNumber=4; // Default wheel number for a car;
    private int wheelSize;
    private String color;

    /**
     * @param make
     * @return 
     */
    @Override
    public CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    /**
     * @param model
     * @return 
     */
    @Override
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    /**
     * @param year
     * @return 
     */
    @Override
    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    /**
     * @param engine
     * @return 
     */
    @Override
    public CarBuilder buildEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * @param wheelNumber
     * @param wheelSize, inch
     * @return 
     */
    @Override
    public CarBuilder buildWheels(int wheelNumber, int wheelSize) {
        this.wheelNumber = wheelNumber;
        this.wheelSize = wheelSize;
        return this;
    }

    /**
     * @param color
     * @return 
     */
    @Override
    public CarBuilder buildColor(String color) {
        this.color = color;
        return this;
    }


    /**
     * @return 
     */
    @Override
    public Car build() {
        return new Car(make, model, year, engine, wheelNumber, wheelSize, color);
    }
}