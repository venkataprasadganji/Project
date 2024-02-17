
package src;
import java.util.List;

import src.VehicleRepository;

public class VehicleCatalogClient {
    private static final Vehicle Vehicle = null;
    private VehicleRepository vehicleRepository;
    private VehicleFactory vehicleFactory;

    public VehicleCatalogClient(VehicleRepository vehicleRepository, VehicleFactory vehicleFactory) {
        this.vehicleRepository = vehicleRepository;
        this.vehicleFactory = vehicleFactory;
    }

    public List<Vehicle> browseVehicleCatalog() {
        // Retrieve all vehicles from the repository
        List<Vehicle> vehicles = vehicleRepository.getAllVehicles();

        return vehicles;
    }

    public List<Vehicle> searchVehicleCatalog(String keyword) {
        // Retrieve vehicles from the repository
        List<Vehicle> vehicles = vehicleRepository.searchVehicles(keyword);
    
        // Display search results
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found matching the keyword: " + keyword);
        } else {
            System.out.println("Search Results:");
            for (Vehicle vehicle : vehicles) {
                // Use factory to create vehicle instance
                VehicleFactory vehicleFactory = getFactoryForVehicleType(vehicle.getType());
                Vehicle concreteVehicle = vehicleFactory.createVehicle(vehicle.getId(),vehicle.getModel(), vehicle.getType(), vehicle.getVariant(), vehicle.getPrice(),vehicle.getDiscount());
                System.out.println("Model: " + concreteVehicle.getModel());
                System.out.println("Type: " + concreteVehicle.getType());
                System.out.println("Price: " + concreteVehicle.getPrice());
                System.out.println("---------------------------");
            }


           
        }
        return vehicles;
    }

    public List<Vehicle> searchVehicleByIdCatalog(int keyword) {
        // Retrieve vehicles from the repository
        List<Vehicle> vehicles = vehicleRepository.getVehicleById(3);
     
    
        // Display search results
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found matching the keyword: " + keyword);
        } else {
            System.out.println("Search Results:");
            for (Vehicle vehicle : vehicles) {
                // Use factory to create vehicle instance
                VehicleFactory vehicleFactory = getFactoryForVehicleType(vehicle.getType());
                Vehicle concreteVehicle = vehicleFactory.createVehicle(vehicle.getId(),vehicle.getModel(), vehicle.getType(), vehicle.getVariant(), vehicle.getPrice(),vehicle.getDiscount());
                System.out.println("Model: " + concreteVehicle.getModel());
                System.out.println("Type: " + concreteVehicle.getType());
                System.out.println("Price: " + concreteVehicle.getPrice());
                System.out.println("---------------------------");
            }


           
        }
        return vehicles;
    }
    
   
    private VehicleFactory getFactoryForVehicleType(String vehicleType) {
        switch (vehicleType) {
            case "HBack":
                return new CarFactory();
            case "SUV":
                return new SUVFactory();
            case "Sedan":
                return new SedanFactory();
            default:
                throw new IllegalArgumentException("Unsupported vehicle type: " + vehicleType);
        }
    }
    
  
}
