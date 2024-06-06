/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cst8288_lab1;

/**
 * This is the main class for running the program
 * @author ryany
 */
public class Cst8288_lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Singleton instance
        VehicleManager vehicleManager = VehicleManager.getInstance();
    
        // Another Singleton instance, used to demonstrate only one instance for Singleton
        VehicleManager anotherManager = VehicleManager.getInstance();
        System.out.println("vehicleManager == anotherManager =>" + (vehicleManager == anotherManager)); // Should print true
    
        // Using VehicleDirector to create vehicles
        VehicleDirector director1 = new VehicleDirector(new CarBuilder());
        Vehicle car1 = director1.construct("Toyota", "Corolla", 2023, "V4 Engine", 4, 16, "Blue");
      
        VehicleDirector director2 = new VehicleDirector(new MotorcycleBuilder());
        Vehicle motorcycle1 = director2.construct("Honda", "CB500F", 2023, "600cc Engine", 2, 12, "Black");

        // Directly using Builder pattern to create vehicles
        Vehicle car2 = new CarBuilder().setMake("Honda").setModel("Odyssey").setYear(2024)
            .buildEngine("V6 Engine").buildWheels(4, 19).buildColor("Black").build();
       
        Vehicle motorcycle2 = new MotorcycleBuilder().setMake("Yamaha").setModel("R1").setYear(2024)
            .buildEngine("V6 Engine").buildWheels(2, 11).buildColor("Black").build();
    
        // Using Simple Factory pattern to create vehicles
        Vehicle car3 = VehicleFactory.createVehicle("car", "Ford", "Escape", 2019);
        Vehicle motorcycle3 = VehicleFactory.createVehicle("motorcycle", "Kawasaki", "Ninja", 2019);
 
        // Adding vehicle to VehicleManager
        vehicleManager.addVehicle(car1);
        vehicleManager.addVehicle(car2);
        vehicleManager.addVehicle(car3);
        vehicleManager.addVehicle(motorcycle1);
        vehicleManager.addVehicle(motorcycle2);        
        vehicleManager.addVehicle(motorcycle3); 
           
        // Demostrate the methods in Car and Motorcycle classes
        car1.stop();
        car1.start();
        car1.speed(80);
        
        motorcycle1.stop();
        motorcycle1.start();                
        motorcycle1.speed(100);
       
        // Output
        System.out.println("List of Vehicles:");
        for (Vehicle vehicle : vehicleManager.getVehicles()) {
            System.out.println(vehicle);
        }
    }
   
}
