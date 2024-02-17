package src;

import java.util.ArrayList;
import java.util.List;

import src.VehicleRepository;


public class VehicleRepositoryImpl implements VehicleRepository {
    
    private List<Vehicle> vehicles;

    public VehicleRepositoryImpl() {
       
        vehicles = new ArrayList<>();
        vehicles.add(new Car(1,"Toyota Camry", "Sedan", "XL",2500000,50000));
        vehicles.add(new Car(2,"Toyota Glanza", "HBack","GT", 2000000,50000));
        vehicles.add(new Car(3,"Toyota Cruiser","SUV", "SX",4500000,30000));
      
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        
        return vehicles;
    }

    @Override
    public List<Vehicle> searchVehicles(String keyword) {
        List<Vehicle> searchResults = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            // Perform case-insensitive search by model or type
            if (vehicle.getModel().toLowerCase().contains(keyword.toLowerCase())||String.valueOf(vehicle.getId()).contains(keyword) ||
                vehicle.getType().toLowerCase().contains(keyword.toLowerCase())) {
                searchResults.add(vehicle);
            }
        }
        return searchResults;
    }

    @Override
    public List<Vehicle>  getVehicleById(int id) {
        List<Vehicle> searchResults = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            // Assuming each vehicle has a unique ID
            if (vehicle.getId() == 3) {
                return searchResults;
            }
        }
        return null; 
    }

   
}
