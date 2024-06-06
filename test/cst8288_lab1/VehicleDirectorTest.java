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
public class VehicleDirectorTest {
	
	private VehicleDirector vehicleDirector;
    private CarBuilder carBuilder;
    private MotorcycleBuilder motorcycleBuilder;
    
    public VehicleDirectorTest() {
    }
    

    @Before
    public void setUp() {
	carBuilder = new CarBuilder();
        motorcycleBuilder = new MotorcycleBuilder();
    }
    
    @After
    public void tearDown() {
        carBuilder = null;
        motorcycleBuilder = null;        
    }

    /**
     * Test of construct method, of class VehicleDirector.
     */
    @Test
    public void testConstructCar() {
        String make = "Toyota";
        String model = "Corolla";
        int year = 2023;
        String engine = "V4 Engine";
        int wheelNumber = 4;
        int wheelSize = 16;
        String color = "Blue";

	vehicleDirector = new VehicleDirector(carBuilder);
        Vehicle vehicle = vehicleDirector.construct(make, model, year, engine, wheelNumber, wheelSize, color);
		
	Car car = (Car) vehicle;

        assertNotNull(car);

        assertEquals(make, car.getMake());
        assertEquals(model, car.getModel());
        assertEquals(year, car.getYear());
        assertEquals(engine, car.getEngine());
        assertEquals(wheelNumber, car.getWheelNumber());
        assertEquals(wheelSize, car.getWheelSize());
        assertEquals(color, car.getColor());
    }
	
    /**
     * Test of construct method, of class VehicleDirector.
     */
    @Test
    public void testConstructMotorcycle() {
        String make = "Honda";
        String model = "CB500F";
        int year = 2024;
        String engine = "600cc Engine";
        int wheelNumber = 2;
        int wheelSize = 12;
        String color = "Red";

	vehicleDirector = new VehicleDirector(motorcycleBuilder);
        Vehicle vehicle = vehicleDirector.construct(make, model, year, engine, wheelNumber, wheelSize, color);
		
	Motorcycle motorcycle = (Motorcycle) vehicle;

        assertNotNull(motorcycle);

        assertEquals(make, motorcycle.getMake());
        assertEquals(model, motorcycle.getModel());
        assertEquals(year, motorcycle.getYear());
        assertEquals(engine, motorcycle.getEngine());
        assertEquals(wheelNumber, motorcycle.getWheelNumber());
        assertEquals(wheelSize, motorcycle.getWheelSize());
        assertEquals(color, motorcycle.getColor());
    }	
    
}
