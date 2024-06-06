/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cst8288_lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This the VehicleFactoryTest
 * @author ryany
 */
public class VehicleFactoryTest {
    
    /**
     * default constructor
     */
    public VehicleFactoryTest() {
    }
    
    /**
     * setUpClass
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     * tearDownClass
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * setUp
     */
    @Before
    public void setUp() {
    }
    
    /**
     * tearDown
     */
    @After
    public void tearDown() {
    }

    /**
     * Test for Create Car by VehicleFactory
     */	
    @Test
    public void testCreateCar() {
        String make = "Toyota";
        String model = "Corolla";
        int year = 2023;

	String type = "car";

        // Call the factory method to create a Car
        Vehicle car = VehicleFactory.createVehicle(type, make, model, year);

        // Verify that a Car object is created
        assertNotNull(car);
        assertTrue(car instanceof Car);

        // Verify car attributes
        assertEquals(make, car.getMake());
        assertEquals(model, car.getModel());
        assertEquals(year, car.getYear());
    }

    /**
     * Test for Create Motorcycle by VehicleFactory
     */
    @Test
    public void testCreateMotorcycle() {
        String make = "Honda";
        String model = "CB500F";
        int year = 2024;
		
        String type = "motorcycle";

        // Call the factory method to create a Motorcycle
        Vehicle motorcycle = VehicleFactory.createVehicle(type, make, model, year);

        // Verify that a Motorcycle object is created
        assertNotNull(motorcycle);
        assertTrue(motorcycle instanceof Motorcycle);

        // Verify motorcycle attributes
        assertEquals(make, motorcycle.getMake());
        assertEquals(model, motorcycle.getModel());
        assertEquals(year, motorcycle.getYear());
    } 
}
