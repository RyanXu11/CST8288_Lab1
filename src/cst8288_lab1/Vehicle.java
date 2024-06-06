/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288_lab1;

/**
 *
 * @author ryany
 */
abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    public abstract void start();
    public abstract void stop();
    public abstract void speed(int speed);
    
    /**
     * 
     * @param make
     * @param model
     * @param year 
     */
    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;    
    }
   
    /**
     * 
     * @return 
     */
    public String getMake() {
        return make;
    }

    /**
     * 
     * @return 
     */
    public String getModel() {
        return model;
    }

    /**
     * 
     * @return 
     */
    public int getYear() {
        return year;
    }

    /**
     * 
     * @param make 
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * 
     * @param model 
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * 
     * @param year 
     */
    public void setColor(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "make=" + make + ", model=" + model + ", year=" + year + '}';
    }
        
}
