/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288_lab1;

/**
 *
 * @author ryany
 */
public class Car extends Vehicle {
    private String engine;
    private int wheelNumber;
    private int wheelSize;
    private String color;

    /**
     * Constructor of Car
     * @param make
     * @param model
     * @param year
     * @param engine
     * @param wheelNumber
     * @param wheelSize
     * @param color 
     */
    public Car(String make, String model, int year, String engine, int wheelNumber, int wheelSize, String color) {
        super(make, model, year);
        this.engine = engine;
        this.wheelNumber = wheelNumber;
        this.wheelSize = wheelSize;        
        this.color = color;
    }

    /**
     * gettor of Engine
     * @return 
     */
    public String getEngine() {
        return engine;
    }

    /**
     * gettor of wheel Number
     * @return 
     */
    public int getWheelNumber() {
        return wheelNumber;
    }

    /**
     * gettor of wheel size
     * @return 
     */
    public int getWheelSize() {
        return wheelSize;
    }

    /**
     * 
     * @return 
     */
    public String getColor() {
        return color;
    }
    
    /**
     * 
     */
    @Override
    public void start(){
        System.out.println("Car started.");
    }

    /**
     * 
     */
    @Override
    public void stop(){
        System.out.println("Car stopped.");
    }

    /**
     * 
     * @param speed
     */
    @Override
    public void speed(int speed){
        System.out.printf("Car's speed is %dkm/h.\n", speed);
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + "[Car{" + "engine=" + engine + ", wheelNumber=" + wheelNumber + ", wheelSize=" + wheelSize + ", color=" + color + "}]";
    }
    
}
