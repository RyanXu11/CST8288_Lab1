/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package cst8288_lab1;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ryany
 */
public class VehicleManagerTest {
    private VehicleManager vehicleManager;
    
    public VehicleManagerTest() {
    }
    
    @Before
    public void setUp() {
	vehicleManager = VehicleManager.getInstance();
        vehicleManager.getVehicles().clear(); // Clear the List before testing
    }
    
    @After
    public void tearDown() {
	vehicleManager = null;
    }

	
    /**
     * Test of getInstance method, of class VehicleManager.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        VehicleManager expResult = vehicleManager;
        VehicleManager anotherManager = VehicleManager.getInstance();
        assertEquals(expResult, anotherManager);
    }

    /**
     * Test of addVehicle method, of class VehicleManager.
     */
    @Test
    public void testAddVehicle() {
        Vehicle vehicle = new Car("Toyota", "Corolla", 2023, "V4 Engine", 4, 16, "Blue");
        vehicleManager.addVehicle(vehicle);
        assertEquals(1, vehicleManager.getVehicles().size());
        assertEquals(vehicle, vehicleManager.getVehicles().get(0));
    }

    /**
     * Test of getVehicles method, of class VehicleManager.
     */
    @Test
    public void testGetVehicles() {
        Vehicle vehicle1 = new Car("Toyota", "Corolla", 2023, "V4 Engine", 4, 16, "Blue");
        Vehicle vehicle2 = new Motorcycle("Honda", "CB500F", 2024, "600cc Engine", 2, 12, "Red");
        vehicleManager.addVehicle(vehicle1);
        vehicleManager.addVehicle(vehicle2);
        List<Vehicle> vehicles = vehicleManager.getVehicles();
        assertEquals(2, vehicles.size());
        assertTrue(vehicles.contains(vehicle1));
        assertTrue(vehicles.contains(vehicle2));
    }
    
}
