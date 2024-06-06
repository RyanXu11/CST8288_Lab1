/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cst8288_lab1;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton VehicleManager
 * @author ryany
 */
public class VehicleManager {
    private static VehicleManager instance;
    private List<Vehicle> vehicles;

    /**
     * private constructor, it can't be accessed from outside the class
     */
    private VehicleManager() {
        vehicles = new ArrayList<>();
    }

    /**
     * public static method to get the instance
     * @return 
     */
    public static VehicleManager getInstance() {
        if (instance == null) { // Lazy Initialization:
            instance = new VehicleManager();
        }
        return instance;
    }

    /**
     * This method is used to add Vehicle to ArrayList vehicles
     * @param vehicle 
     */
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    /**
     * getter of vehicles
     * @return 
     */
    public List<Vehicle> getVehicles() {
        return vehicles;
    }    
}
