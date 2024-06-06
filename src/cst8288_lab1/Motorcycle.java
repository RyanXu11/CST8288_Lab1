/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288_lab1;

/**
 *
 * @author ryany
 */
public class Motorcycle extends Vehicle {
    private String engine;
    private int wheelNumber;
    private int wheelSize;
    private String color;

    /**
     * Constructor of Motorcycle
     * @param make
     * @param model
     * @param year
     * @param engine
     * @param wheelNumber
     * @param wheelSize
     * @param color 
     */
    public Motorcycle(String make, String model, int year, String engine, int wheelNumber, int wheelSize, String color) {
        super(make, model, year);
        this.engine = engine;
        this.wheelNumber = wheelNumber;
        this.wheelSize = wheelSize;		
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public String getColor() {
        return color;
    }

    
    
    /**
     * 
     */
    @Override
    public void start() {
        System.out.println("Motorcycle started.");
    }

    /**
     * 
     */
    @Override
    public void stop() {
        System.out.println("Motorcycle stopped.");
    }

    /**
     * 
     * @param speed
     */
    @Override
    public void speed(int speed){
        System.out.printf("Motorcycle's speed is %d/km.\n", speed);
    } 
	
	
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + "[Motorcycle{" + "engine=" + engine + ", wheelNumber=" + wheelNumber + ", wheelSize=" + wheelSize + ", color=" + color + "}]";
    }
    
}
