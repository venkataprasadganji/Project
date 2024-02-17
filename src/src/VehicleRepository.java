package src;

import java.util.List;

public interface VehicleRepository {
    // Method to retrieve all vehicles from the catalog
    List<Vehicle> getAllVehicles();

    // Method to search for vehicles by keyword
    List<Vehicle> searchVehicles(String keyword);

    // Method to retrieve a specific vehicle by ID
    List<Vehicle>  getVehicleById(int id);

    // Add other methods as needed, such as methods to add, update, or delete vehicles
}
